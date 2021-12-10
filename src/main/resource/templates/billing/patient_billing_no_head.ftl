
<form id="billingItemForm" action="billing/patient_billing_items_no_head?patient_id=" method="post">
<#--	<input type="hidden" name="pageNum" value="${((page.pageIndex)!0)}" />-->
<#--	<input type="hidden" name="numPerPage" value="${(page.pageSize)!}" />-->
</form>

<div id="billingItemDiv" class="pageContent">
<#--	<div class="panelBar">-->
<#--		<ul class="toolBar">-->
<#--			<@shiro.hasPermission name="patient:del">-->
<#--				<li><a class="delete" onclick="deleteItem({billing_sid});" title="确定要删除吗?"><span>删除</span></a></li>-->
<#--			</@shiro.hasPermission>-->
<#--			<li class="line">line</li>-->
<#--		</ul>-->
<#--	</div>-->
	<table class="table" width="99%" layoutH="138">
		<thead>
		<tr>
			<th>项目编码</th>
			<th>项目名称</th>
			<th>数量</th>
			<th>计价单位</th>
			<th>项目价格(元)</th>
			<th>操作</th>
		</tr>
		</thead>
		<tbody>
		<#list list as billing>
			<tr target="billing_sid" rel="${billing.id}">
				<td>${billing.billingCode!}</td>
				<td>${billing.billingName!}</td>
				<td>${billing.amount!}</td>
				<td>${billing.unit!}</td>
				<td>${billing.unitPrice!}</td>
				<td>
					<@shiro.hasPermission name="billing:del">
						<a class="delete" onclick="deleteItem('${billing.id}');" title="确定要删除吗?"><span>删除</span></a>
					</@shiro.hasPermission>
				</td>
			</tr>
			</#list> 
		</tbody>
	</table>

	<div class="panelBar">
		<div style="float: right; margin-top: 5px; margin-right: 5px;">
			<span style="margin: 1px 0 0 1px;">项目总收费，共 </span>
			<span style="font-weight:bold; color: red;">${totalBilling!}</span>
			<span> 元</span>
		</div>
	</div>
</div>