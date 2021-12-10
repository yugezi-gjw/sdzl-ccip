 
<div class="pageHeader" style="border:1px #B8D0D6 solid">
	<form onsubmit="return queryPatient(this, 'jbsxBox2');" action="billing/patient_list" method="post">
		<input type="hidden" name="pageNum" value="${((page.pageIndex)!0)}" />
		<input type="hidden" name="numPerPage" value="${(page.pageSize)!}" />
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
					<li>
						<div class="buttonActive">
							<#--                  <div class="buttonContent">-->
							<a href="billing/adv_search" target="dialog" mask="true" title="查询框"><span>高级检索</span></a>
							<#--                  </div>-->
						</div>
					</li>
				</ul>
			</div>
		</div>
	</form>
</div>
<div class="pageContent" style="border-left:1px #B8D0D6 solid;border-right:1px #B8D0D6 solid">
	<table class="table" width="99%" layoutH="138" rel="jbsxBox2">
		<thead>
		<tr>
			<th orderField="id"  >ID</th>
			<th>姓名</th>
			<th>患者ID</th>
			<th>医师</th>
			<th>登记日期</th>
			<th>电话</th>
		</tr>
		</thead>
		<tbody>
		<#list list as patient>
			<tr target="sid" rel="${patient.id}" onclick="showPatientBilling('${patient.patient_id!}');">
				<td>${patient.id!}</td>
				<td>${patient.patient_name!}</td>
				<td>${patient.patient_id!}</td>
				<td>${patient.physician!}</td>
				<td>${patient.created_at!?string("yyyy-MM-dd")}</td>
				<td>${patient.telephone!}</td>
			</tr>
			</#list> 
		</tbody>
	</table>
	
		<#include "../include_page/page.ftl"/>
	
</div>
