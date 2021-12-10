 
<form method="post" action="billing/save.do" class="pageForm required-validate" onsubmit="return iframeCallback(this, save);">
	<input name="id" type="hidden" value="${(model.id)!}" />
	<input name="patientId" type="hidden" value="${(model.patientId)!}" />
	<input name="encounterId" type="hidden" value="${(model.encounterId)!}" />
	<div class="formBar">
		<ul>
			<li><button type="submit" class="buttonActive">保存</button></li>
			<li><button type="button" class="button close">取消</button></li>
		</ul>
	</div>
	<div class="pageContent">
		<div class="pageFormContent" layoutH="56">
			<dl>
				<dt>姓名：</dt>
				<dd><label>${(patient.patientName)!}</label></dd>
			</dl>
			<dl>
				<dt>患者ID：</dt>
				<dd><label>${(patient.patientId)!}</label></dd>
			</dl>
			<dl>
				<dt>收费项目：</dt>
				<dd><select style="margin-right:3px; font-size: 12px; width: 212px; padding: 2px 2px 2px 2px" name="billingCode" value="${(model.billingCode)!}">
						<#list billingItemList as item>
							<#if model?? && model.itemCode?? && item.code == model.itemCode>
								<option value="${item.code!}" selected>${item.name!}</option>
							<#else>
								<option value="${item.code!}">${item.name!}</option>
							</#if>
						</#list>
					</select></dd>
			</dl>
			<dl>
				<dt>数量：</dt>
				<dd><input name="amount" type="text" size="30" value="${(model.amount)!}"/></dd>
			</dl>
		</div>
	</div>
</form>