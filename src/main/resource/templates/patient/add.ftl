 
<form method="post" action="patient/save.do" class="pageForm required-validate" onsubmit="return iframeCallback(this, dialogAjaxDone);">
	<input name="id" type="hidden" value="${(model.id)!}" />
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
				<dd><input class="required" name="patientName" type="text" size="30" value="${(model.patientName)!}"/></dd>
			</dl>
			<dl>
				<dt>住院号：</dt>
				<dd><input class="required" name="inpatientId" type="text" size="30" value="${(model.inpatientId)!}"/></dd>
			</dl>
			<dl>
				<dt>性别：</dt>
				<dd>
					<select style="margin-right:3px; font-size: 12px; width: 212px; padding: 2px 2px 2px 2px" name="gender" value="${(model.gender)!}">
						<option value="1" selected>男</option>
						<option value="2">女</option>
					</select></dd>
			</dl>
			<dl>
				<dt>初诊年龄：</dt>
				<dd><input name="firstVisitAge" type="text" size="30" value="${(model.firstVisitAge)!}" /></dd>
			</dl>
			<dl>
				<dt>吸烟史：</dt>
				<dd><input name="smoker" type="text" size="30" value="${(model.smoker)!}"/></dd>
			</dl>
			<dl>
				<dt>身份证：</dt>
				<dd><input name="nationalId" type="text" size="30" value="${(model.nationalId)!}"/></dd>
			</dl>
			<dl>
				<dt>电话：</dt>
				<dd><input name="telephone" type="text" size="30" value="${(model.telephone)!}"/></dd>
			</dl>
			<dl>
				<dt>电话2：</dt>
				<dd><input name="telephone2" type="text" size="30" value="${(model.telephone2)!}"/></dd>
			</dl>

		</div>
	</div>
</form>