grammar apron;
import Token;
program:
       perm_list                            #final
       ;
perm_list:
         perm                               #perm_list__wo
         |perm perm_list                    #perm_list__w
         ;
perm:
    PERM perm_name                          #perm__wo
    |PERM perm_name LIMITING filter_expr    #perm__w
    ;
filter_expr:
    filter_term                             #filter_expr__term
    |filter_expr AND filter_term            #filter_expr__expr_and_term
    ;
filter_term:
    filter_factor                           #filter_term__factor
    |filter_term OR filter_factor           #filter_term__term_or_factor
    ;
filter_factor:
    filter_not_factor                       #filter_factor__not_factor
    |NOT filter_factor                      #filter_factor__NOT
    ;
filter_not_factor:
    '(' filter_expr ')'                     #filter_expr_
    |flow_predicate                         #flow_predicate_
    |topo                                   #topo_
    |ACTION action                          #action_
    |ownership                              #ownership_
    |max_priority                           #max_priority_
    |flow_table                             #flow_table_
    |notification                           #notification_
    |statistics                             #statistics_
    ;    
flow_predicate:
              ip_range                      #ip_range_
              |field '{' value_list'}'      #field_
              ;
field:
     TCP_SRC
     |TCP_DST
     |VLAN_ID
     |IP_SRC
     |IP_DST
     ;
value_list:
          value_range                       #value_list__s
          |value_range ',' value_list       #value_list__w
          ;
value_range:
           INT                              #value_range_s
           |INT '-' INT                     #value_range_w
           ;
ip_range:
        IP ip_format WITH MASK ip_format    
        ;
ip_format:
         IP_FORMAT
         ;
topo:
    physical_topo                           #physical_topo_
    |virtual_topo                           #virtual_topo_
    ;
physical_topo:
             SWITCH switch_set AND LINK link_set
             ;
switch_set:
          ALL_SWITCHES
          |BORDER_SWITCHES
          |'{' sw_idx_list '}'
          ;
sw_idx_list:
           sw_idx
           |sw_idx ',' sw_idx_list
           ;
sw_idx:
      INT
      ;
link_set:
        ALL_DIRECT_LINKS
        |ALL_PATHS_AS_LINKS
        |link_list
        ;
link_list:
         link
         |link ',' link_list
         ;
link:
    link_idx
    |'(' path ')'
    ;
path:
    link_idx
    |link_idx ':' path
    ;
link_idx:
        INT
        ;
virtual_topo:
            VIRTUAL SWITCH switch_mapping AND LINK link_set
            ;
switch_mapping:
              SINGLE_BIG_SWITCH
              |'{' virtual_switch_set '}'
              ;
virtual_switch_set:
          switch_set AS sw_idx
          |switch_set AS sw_idx ',' virtual_switch_set
          ;
action:
      DROP
      |FORWARD
      |MODIFY
      |MODIFY FIELD field_list
      ;
field_list:
          field
          |field ',' field_list
          ;    
ownership:
         OWN_FLOWS
         |OTHERS_FLOWS
         |ALL_FLOWS
         ;
max_priority:
            MAX_PRIORITY INT
            ;
flow_table:
    RULE_COUNT_PER_SWITCH INT
    |SIZE_PERCENTAGE_PER_SWITCH FLOAT
    ;
notification:
            EVENT_INTERCEPTION
            |MODIFY_EVENT_ORDER
            ;
statistics:
          FLOW_LEVEL
          |PORT_LEVEL
          |SWITCH_LEVEL
          ;
perm_name:
         STRING
         ;
