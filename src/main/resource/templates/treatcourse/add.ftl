 
<form method="post" action="treatcourse/save.do" class="pageForm required-validate" onsubmit="return iframeCallback(this, dialogAjaxDone);">
	<input name="patientId" type="hidden" value="${(model.patientId)!}" />
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
				<dd><input name="patientName" type="text" value="${(patientDto.patientName)!}" readonly="readonly"/></dd>
			</dl>
			<dl>
				<dt>住院号：</dt>
				<dd><input name="inpatientId" type="text" value="${(patientDto.inpatientId)!}" readonly="readonly"/></dd>
			</dl>
			<dl>
				<dt>部位：</dt>
				<dd>
					<select style="margin-right:3px; font-size: 12px; width: 130px; padding: 2px 2px 2px 2px" name="bodypartCode" value="${(model.bodypartCode)!}">
						<option value="chest" selected>肺</option>
						<option value="galactophore">乳腺</option>
					</select>
				</dd>
			</dl>
		</div>
	</div>
</form>