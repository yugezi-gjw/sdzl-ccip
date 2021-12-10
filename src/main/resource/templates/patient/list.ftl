 
<form id="pagerForm" method="post" action="patient/list">
	 
	<input type="hidden" name="pageNum" value="${((page.pageIndex)!0)}" />
	<input type="hidden" name="numPerPage" value="${(page.pageSize)!}" />
</form>
 
 

<div class="pageHeader">
	<form onsubmit="return navTabSearch(this);" action="patient/list" method="post">
	<div class="searchBar">
		<table class="searchContent">
			<tr>
				<td>
					<input name="keyword" class="digits" type="text" size="30" alt="请输入患者姓名或ID号" value="${keyword!}"/>
				</td>
				<td>
					<div class="buttonActive">
						<div class="buttonContent">
							<button type="submit">检 索</button>
						</div>
					</div>
				</td>
			</tr>
		</table>
		<div class="subBar">
			<ul>
				<li><a class="button" href="patient/adv_search" target="dialog" mask="true" title="查询框"><span>高级检索</span></a></li>
			</ul>
		</div>
	</div>
	</form>
</div>
<div class="pageContent">
	<div class="panelBar">
		<ul class="toolBar">
			<@shiro.hasPermission name="patient:add">
			<li><a class="add" href="patient/add" target="dialog" rel="save"><span>添加患者</span></a></li>
			</@shiro.hasPermission>
			<@shiro.hasPermission name="patient:del">
			<li><a class="delete" href="patient/del?id={sid}" target="ajaxTodo" title="确定要删除吗?"><span>删除患者</span></a></li>
			</@shiro.hasPermission>
			<@shiro.hasPermission name="patient:upd">
			<li><a class="edit" href="patient/upd?id={sid}" target="dialog"><span>修改患者</span></a></li>
			</@shiro.hasPermission>
			<li class="line">line</li>
			<@shiro.hasPermission name="patient:add">
				<li><a class="add" href="encounter/add?patientId={sid}" target="dialog" rel="save" width="850" height="750"><span>添加就诊信息</span></a></li>
			</@shiro.hasPermission>
			<@shiro.hasPermission name="patient:upd">
				<li><a class="edit" href="encounter/upd?patientId={sid}" target="dialog"><span>修改就诊信息</span></a></li>
			</@shiro.hasPermission>
			<li class="line">line</li>
			<@shiro.hasPermission name="patient:imp">
				<li><a class="icon" href="patient/imp" target="dialog" rel="save"><span>导入</span></a></li>
			</@shiro.hasPermission>
		 </ul>
	</div>
	<table class="table" width="100%" layoutH="138">
		<thead>
			<tr>
				<th orderField="id"  >ID</th>
				<th>姓名</th>
				<th>住院号</th>
				<th>性别</th>
				<th>出生日期</th>
				<th>吸烟史</th>
				<th>身份证号</th>
				<th>手机号1</th>
				<th>手机号2</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
		<#list list as patient>
			<tr target="sid" rel="${patient.id}">
				<td>${patient.id!}</td>
				<td>${patient.patientName!}</td>
				<td>${patient.inpatientId!}</td>
				<td>${patient.gender!}</td>
				<td>${patient.birthDate!}</td>
				<td>${patient.smoker!}</td>
				<td>${patient.nationalId!}</td>
				<td>${patient.telephone!}</td>
				<td>${patient.telephone2!}</td>
				<td>
					<@shiro.hasPermission name="patient:list">
						<a class="button" href="patient/detail?id=${patient.id!}" onclick="viewDetail(${patient.id!})" target="navTab"><span>查看详细</span></a>
					</@shiro.hasPermission>
				</td>
			</tr>
			</#list> 
		</tbody>
	</table>
	
		<#include "../include_page/page.ftl"/>
	
</div>
