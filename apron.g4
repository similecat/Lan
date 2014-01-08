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
          ALL_SWITCHES                      #all_switches_
          |BORDER_SWITCHES                  #border_switches_
          |'{' sw_idx_list '}'              #sw_idx_list_
          ;
sw_idx_list:
           sw_idx                           #sw_idx_list__wo
           |sw_idx ',' sw_idx_list          #sw_idx_list__w
           ;
sw_idx:
      INT
      ;
link_set:
        ALL_DIRECT_LINKS                    #all_driect_links_
        |ALL_PATHS_AS_LINKS                 #all_paths_as_links_
        |link_list                          #link_list_
        ;
link_list:
         link                               #link_list__wo
         |link ',' link_list                #link_list__w
         ;
link:
    link_idx                                #link__wo
    |'(' path ')'                           #link__w
    ;
path:
    link_idx                                #path__wo
    |link_idx ':' path                      #path__w
    ;
link_idx:
        INT
        ;
virtual_topo:
            VIRTUAL SWITCH switch_mapping AND LINK link_set
            ;
switch_mapping:
              SINGLE_BIG_SWITCH             #single_big_switch_
              |'{' virtual_switch_set '}'   #virtual_switch_set_
              ;
virtual_switch_set:
          switch_set AS sw_idx              #virtual_switch_set__wo
          |switch_set AS sw_idx ',' virtual_switch_set  #virtual_switch_set__w
          ;
action:
      DROP                                  #drop_
      |FORWARD                              #forward_
      |MODIFY                               #modify_
      |MODIFY FIELD field_list              #modify_field_
      ;
field_list:
          field                             #filed__wo
          |field ',' field_list             #field__w
          ;    
ownership:
         OWN_FLOWS                          #own_flows_
         |OTHERS_FLOWS                      #others_flows_
         |ALL_FLOWS                         #all_flows_
         ;
max_priority:
            MAX_PRIORITY INT
            ;
flow_table:
    RULE_COUNT_PER_SWITCH INT               #flow_table__1
    |SIZE_PERCENTAGE_PER_SWITCH FLOAT       #flow_table_2
    ;
notification:
            EVENT_INTERCEPTION              #event_interception_
            |MODIFY_EVENT_ORDER             #modify_event_order_
            ;
statistics:
          FLOW_LEVEL                        #flow_level_
          |PORT_LEVEL                       #port_level_
          |SWITCH_LEVEL                     #switch_level_
          ;
perm_name:
         STRING
         ;
