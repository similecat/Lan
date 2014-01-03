// Generated from apron.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface apronVisitor<T> extends ParseTreeVisitor<T> {
	T visitFilter_term__factor(apronParser.Filter_term__factorContext ctx);

	T visitIp_range(apronParser.Ip_rangeContext ctx);

	T visitLink(apronParser.LinkContext ctx);

	T visitMax_priority(apronParser.Max_priorityContext ctx);

	T visitSwitch_mapping(apronParser.Switch_mappingContext ctx);

	T visitStatistics(apronParser.StatisticsContext ctx);

	T visitValue_list(apronParser.Value_listContext ctx);

	T visitField_list(apronParser.Field_listContext ctx);

	T visitFilter_not_factor(apronParser.Filter_not_factorContext ctx);

	T visitFilter_expr__term(apronParser.Filter_expr__termContext ctx);

	T visitFlow_predicate(apronParser.Flow_predicateContext ctx);

	T visitAction(apronParser.ActionContext ctx);

	T visitPath(apronParser.PathContext ctx);

	T visitNotification(apronParser.NotificationContext ctx);

	T visitPerm_list__wo(apronParser.Perm_list__woContext ctx);

	T visitPhysical_topo(apronParser.Physical_topoContext ctx);

	T visitFlow_table(apronParser.Flow_tableContext ctx);

	T visitLink_list(apronParser.Link_listContext ctx);

	T visitPerm__wo(apronParser.Perm__woContext ctx);

	T visitValue_range(apronParser.Value_rangeContext ctx);

	T visitFilter_factor__not_factor(apronParser.Filter_factor__not_factorContext ctx);

	T visitLink_idx(apronParser.Link_idxContext ctx);

	T visitVirtual_topo(apronParser.Virtual_topoContext ctx);

	T visitFinal(apronParser.FinalContext ctx);

	T visitPerm_name(apronParser.Perm_nameContext ctx);

	T visitSw_idx_list(apronParser.Sw_idx_listContext ctx);

	T visitSw_idx(apronParser.Sw_idxContext ctx);

	T visitIp_format(apronParser.Ip_formatContext ctx);

	T visitTopo(apronParser.TopoContext ctx);

	T visitFilter_term__term_or_factor(apronParser.Filter_term__term_or_factorContext ctx);

	T visitFilter_expr__expr_and_term(apronParser.Filter_expr__expr_and_termContext ctx);

	T visitSwitch_set(apronParser.Switch_setContext ctx);

	T visitField(apronParser.FieldContext ctx);

	T visitLink_set(apronParser.Link_setContext ctx);

	T visitVirtual_switch_set(apronParser.Virtual_switch_setContext ctx);

	T visitOwnership(apronParser.OwnershipContext ctx);

	T visitPerm__w(apronParser.Perm__wContext ctx);

	T visitFilter_factor__NOT(apronParser.Filter_factor__NOTContext ctx);

	T visitPerm_list__w(apronParser.Perm_list__wContext ctx);
}