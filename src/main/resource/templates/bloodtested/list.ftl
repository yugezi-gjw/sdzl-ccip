<div>
	<div id="bloodTestedDiv" class="pageContent">
		<table class="table" width="100%" layoutH="158" addButton="新建">
			<thead>
			<tr>
<#--				<th orderField="id"  >ID</th>-->
				<th>检测时间</th>
				<th>白细胞</th>
				<th>中性粒细胞</th>
				<th>淋巴细胞</th>
				<th>单核细胞</th>
				<th>血小板</th>
				<th>SII</th>
				<th>NLR</th>
				<th>PLR</th>
				<th>LMR</th>
				<th>备注</th>
				<th>操作</th>
			</tr>
			</thead>
			<tbody>
			<#list list as bloodTested>
<#--				<td>${bloodTested.id!}</td>-->
				<td>${bloodTested.testedName!}</td>
				<td>${bloodTested.whiteCells!}</td>
				<td>${bloodTested.neutrophilLeucocyte!}</td>
				<td>${bloodTested.lymphocyte!}</td>
				<td>${bloodTested.monocyte!}</td>
				<td>${bloodTested.thrombocyte!}</td>
				<td>${bloodTested.sii!}</td>
				<td>${bloodTested.nlr!}</td>
				<td>${bloodTested.plr!}</td>
				<td>${bloodTested.lmr!}</td>
				<td>${bloodTested.comment!}</td>
				<td>
						<a class="delete" onclick="deleteItem('${bloodTested.id}');"><span>删除</span></a>
				</td>
				</tr>
			</#list>
			</tbody>
		</table>
	</div>
</div>