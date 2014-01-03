public class EvalVisitor extends apronBaseVisitor <Boolean>{
    public ACLRequest perm_req = new ACLRequest();
    public Boolean visitPerm_list__wo(apronParser.Perm_list__woContext ctx){
        Boolean ret = visit(ctx.perm());
        return ret;
    }
    public Boolean visitPerm_list__w(apronParser.Perm_list__wContext ctx){
        Boolean ret0 = visit(ctx.perm());
        Boolean ret1 = visit(ctx.perm_list());
        return ret0&&ret1;
    }
    public Boolean visitPerm__wo(apronParser.Perm__woContext ctx){
        String perm_name = ctx.perm_name().getText();
        return true;
    }
    public Boolean visitPerm__w(apronParser.Perm__wContext ctx){
        String perm_name = ctx.perm_name().getText();
        Boolean ret = true;
        if(perm_name.equals(perm_req.getapp())){
            ret = visit(ctx.filter_expr());
        }
        return true;
    }
    /*
    boolean visitIp_range(apronParser.Ip_rangeContext ctx){
    }
    boolean visitLink(apronParser.LinkContext ctx){
    }
    boolean visitMax_priority(apronParser.Max_priorityContext ctx);
    boolean visitSwitch_mapping(apronParser.Switch_mappingContext ctx);
    boolean visitPerm(apronParser.PermContext ctx);
    boolean visitStatistics(apronParser.StatisticsContext ctx);
    boolean visitValue_list(apronParser.Value_listContext ctx);
    boolean visitField_list(apronParser.Field_listContext ctx);
    boolean visitFilter_not_factor(apronParser.Filter_not_factorContext ctx);
    boolean visitFlow_predicate(apronParser.Flow_predicateContext ctx);
    boolean visitAction(apronParser.ActionContext ctx);
    boolean visitPath(apronParser.PathContext ctx);
    boolean visitNotification(apronParser.NotificationContext ctx);
    boolean visitPhysical_topo(apronParser.Physical_topoContext ctx);
    boolean visitFlow_table(apronParser.Flow_tableContext ctx);
    boolean visitValue_range(apronParser.Value_rangeContext ctx);
    boolean visitLink_list(apronParser.Link_listContext ctx);
    boolean visitLink_idx(apronParser.Link_idxContext ctx);
    boolean visitFinal(apronParser.FinalContext ctx);
    boolean visitVirtual_topo(apronParser.Virtual_topoContext ctx);
    boolean visitPerm_name(apronParser.Perm_nameContext ctx);
    boolean visitSw_idx_list(apronParser.Sw_idx_listContext ctx);
    boolean visitSw_idx(apronParser.Sw_idxContext ctx);
    boolean visitIp_format(apronParser.Ip_formatContext ctx);
    boolean visitTopo(apronParser.TopoContext ctx);
    boolean visitSwitch_set(apronParser.Switch_setContext ctx);
    boolean visitField(apronParser.FieldContext ctx);
    boolean visitLink_set(apronParser.Link_setContext ctx);
    boolean visitFilter_expr(apronParser.Filter_exprContext ctx);
    boolean visitVirtual_switch_set(apronParser.Virtual_switch_setContext ctx);
    boolean visitOwnership(apronParser.OwnershipContext ctx);
    boolean visitFilter_term(apronParser.Filter_termContext ctx);
    boolean visitPerm_list(apronParser.Perm_listContext ctx);
    boolean visitFilter_factor(apronParser.Filter_factorContext ctx);
*/
}
