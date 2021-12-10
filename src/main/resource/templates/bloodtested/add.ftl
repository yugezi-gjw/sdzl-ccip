 
<form method="post" action="bloodtested/save.do" class="pageForm required-validate" onsubmit="return iframeCallback(this, dialogAjaxDone);">
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
				<dt>检测时间：</dt>
				<dd><input name="testedName" type="text" value="${(model.testedName)!}"/></dd>
			</dl>
			<dl>
				<dt>白细胞：</dt>
				<dd><input name="whiteCells" type="text" value="${(model.whiteCells)!}"/></dd>
			</dl>
			<dl>
				<dt>中性粒细胞：</dt>
				<dd><input name="neutrophilLeucocyte" type="text" value="${(model.neutrophilLeucocyte)!}"/></dd>
			</dl>
			<dl>
				<dt>淋巴细胞：</dt>
				<dd><input name="lymphocyte" type="text" value="${(model.lymphocyte)!}"/></dd>
			</dl>
			<dl>
				<dt>单核细胞：</dt>
				<dd><input name="monocyte" type="text" value="${(model.monocyte)!}"/></dd>
			</dl>
			<dl>
				<dt>血小板：</dt>
				<dd><input name="thrombocyte" type="text" value="${(model.thrombocyte)!}"/></dd>
			</dl>
			<dl>
				<dt>SII：</dt>
				<dd><input name="sii" type="text" value="${(model.sii)!}"/></dd>
			</dl>
			<dl>
				<dt>NLR：</dt>
				<dd><input name="nlr" type="text" value="${(model.nlr)!}"/></dd>
			</dl>
			<dl>
				<dt>PLR：</dt>
				<dd><input name="plr" type="text" value="${(model.plr)!}"/></dd>
			</dl>
			<dl>
				<dt>LMR：</dt>
				<dd><input name="lmr" type="text" value="${(model.lmr)!}"/></dd>
			</dl>

		</div>
	</div>
</form>