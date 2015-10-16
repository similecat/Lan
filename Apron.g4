grammar Apron;
import Token;
program:
       perm_list                            #Final
       ;
perm_list:
         perm                               #PermListS
         |perm perm_list                    #PermListM
         ;
perm:
    PERM perm_name                          #PermS
    |PERM perm_name LIMITING filter_expr    #PermM
    ;
filter_expr:
    filter_term                             #FilterExprTerm
    |filter_expr AND filter_term            #FilterExprAndTerm
    ;
filter_term:
    filter_factor                           #FilterTermFactor
    |filter_term OR filter_factor           #FilterTermOrFactor
    ;
filter_factor:
    filter_not_factor                       #FilterFactorNotFactor
    |NOT filter_factor                      #FilterFactorNot
    ;
filter_not_factor:
    '(' filter_expr ')'                     #FilterExpr
    |flow_predicate                         #FlowPredicate
    |topo                                   #Topology
    |ACTION action                          #Actions
    |ownership                              #OwnershipS
    |max_priority                           #MaxPriority
    |flow_table                             #FlowTable
    |notification                           #NotificationS
    |statistics                             #StatisticsS
    |pkt_out                                #PktOut
    |system                                 #SystemS
    ;    
flow_predicate:
    field val                               #FieldVal
    |field val MASK val                     #FieldMask
    |WILDCARD field val                     #Wildcard
    |MACFields mac                          #MacFieldPre
    |INTFields INT                          #IntFieldPre
    ;


field:
    TCP_SRC
    |TCP_DST
    |VLAN_ID
    |IP_SRC
    |IP_DST
    |ARPIPfield
    ;

MACFields:
    ETHField
    |ARPMACfield
    ;
INTFields:
    ICMPfield
    |SCTPfield
    |UDPfield
    |OtherIntField
    ;
ETHField:
    ETH_SRC
    |ETH_DST
    ;
ARPIPfield:
    ARP_OP
    |ARP_IP_SRC
    |ARP_IP_DST
    ;
ARPMACfield:
    ARP_MAC_SRC
    |ARP_MAC_DST
    ;
ICMPfield:
    ICMP_TYPE
    |ICMP_CODE
    ;
SCTPfield:
    SCTP_SRC
    |SCTP_DST
    ;
UDPfield:
    UDP_SRC
    |UDP_DST
    ;
OtherIntField:
    IN_PORT
    |PHY_PORT
    |ETH_TYPE
    |IP_PROTO
    ;
mac:
    NUM16 ':' NUM16 ':' NUM16 ':' NUM16 ':' NUM16 ':' NUM16 #MacVal
    ;

val:
    INT                                     #ValInt
    |IP_FORMAT                              #ValIp
    ;
topo:
    physical_topo                           #PhysicalTopo
    |virtual_topo                           #VirtualTopo
    ;
physical_topo:
             SWITCH switch_set AND LINK link_set
             ;
switch_set:
          ALL_SWITCHES                      #AllSwitches
          |BORDER_SWITCHES                  #BorderSwitches
          |'{' sw_idx_list '}'              #SwIdxList
          ;
sw_idx_list:
           sw_idx                           #SwIdxListS
           |sw_idx ',' sw_idx_list          #SwIdxListM
           ;
sw_idx:
      INT
      ;
link_set:
        ALL_DIRECT_LINKS                    #AllDriectLinks
        |ALL_PATHS_AS_LINKS                 #AllPathsAsLinks
        |link_list                          #LinkList
        ;
link_list:
         link                               #LinkListS
         |link ',' link_list                #LinkListM
         ;
link:
    link_idx ':' link_idx ';'               #LinkS
    |'(' path ')'                           #LinkM
    ;
path:
    link_idx                                #PathS
    |link_idx ':' path                      #PathM
    ;
link_idx:
    sw_idx ',' INT
    ;
virtual_topo:
            VIRTUAL SWITCH switch_mapping AND LINK link_set
            ;
switch_mapping:
              SINGLE_BIG_SWITCH             #SingleBigSwitch
              |'{' virtual_switch_set '}'   #VirtualSwitchSet
              ;
virtual_switch_set:
          switch_set AS sw_idx              #VirtualSwitchSetS
          |switch_set AS sw_idx ',' virtual_switch_set  #VirtualSwitchSetM
          ;
action:
    DROP                                    #Drop
    |FORWARD                                #Forward
    |MODIFY                                 #Modify
    |MODIFY FIELD field_list                #ModifyField
    |OperateAction                          #ActionOp
    ;
OperateAction:
    COPY_TTL_OUT
    |COPY_TTL_IN
    |SET_MPLS_TTL
    |DEC_MPLS_TTL
    |PUSH_MPLS
    |POP_MPLS
    |PUSH_VLAN
    |POP_VLAN
    |SET_QUEUE
    |GROUP
    |SET_NW_TTL
    |DEC_NW_TTL
    |PUSH_PBB
    |POP_PBB
    |EXPERIMENTER
    ;
field_list:
    field                                   #FieldS1
    |MACFields                              #FieldS2
    |INTFields                              #FieldS3
    |field ',' field_list                   #FieldM1
    |MACFields ',' field_list               #FieldM2
    |INTFields ',' field_list               #FieldM3
    ;    

ownership:
         OWN_FLOWS                          #OwnFlows
         |OTHERS_FLOWS                      #OthersFlows
         |ALL_FLOWS                         #AllFlows
         ;
max_priority:
            MAX_PRIORITY INT                #PriorityMax
            |MIN_PRIORITY INT               #PriorityMin
            ;
flow_table:
    RULE_COUNT_PER_SWITCH INT               #FlowTableA
    |SIZE_PERCENTAGE_PER_SWITCH FLOAT       #FlowTableB
    ;
notification:
            EVENT_INTERCEPTION              #EventInterception
            |MODIFY_EVENT_ORDER             #ModifyEventOrder
            ;
statistics:
          FLOW_LEVEL                        #FlowLevel
          |PORT_LEVEL                       #PortLevel
          |SWITCH_LEVEL                     #SwitchLevel
          ;
pkt_out:
        FROM_PKT_IN                         #PktOutDeny
        |ARBITRARY                          #PktOutAllow
        ;
perm_name:
         STRING
         ;
system:
        AllowNetworkAccess                  #NetworkAllow
        |DenyNetworkAccess                  #NetworkDeny
        |AllowFileSystem                    #FileAllow
        |DenyFileSystem                     #FileDeny
        |AllowProcessRuntime                #ProcessAllow
        |DenyProcessRuntime                 #ProcessDeny
        ;
