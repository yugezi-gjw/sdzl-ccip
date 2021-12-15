 
<form method="post" action="encounter/save.do" class="pageForm required-validate" onsubmit="return iframeCallback(this, dialogAjaxDone);">
	<input name="id" type="hidden" value="${(model.id)!}" />
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
				<dt>分期：</dt>
				<dd><input name="stage" type="text" value="${(model.stage)!}"/></dd>
			</dl>
			<dl>
				<dt>EGFR基因突变：</dt>
				<dd><input name="egfr" type="text" value="${(model.egfr)!}"/></dd>
			</dl>
			<dl>
				<dt>准确诊断日期：</dt>
				<dd><input name="diagnosisDt" type="text" class="date" value="${(model.diagnosisDt)!}"/></dd>
			</dl>
			<dl>
				<dt>准确死亡日期：</dt>
				<dd><input name="deathDt" type="text" class="date" value="${(model.deathDt)!}"/></dd>
			</dl>
			<dl>
				<dt>最近一次住院：</dt>
				<dd><input name="lastInpatientDt" type="text" class="date" value="${(model.lastInpatientDt)!}"/></dd>
			</dl>
			<dl>
				<dt>准确OS：</dt>
				<dd><input name="accurateOs" type="text" value="${(model.accurateOs)!}"/></dd>
			</dl>
			<dl>
				<dt>生存状态：</dt>
				<dd>
					<select style="margin-right:3px; font-size: 12px; width: 152px; padding: 2px 2px 2px 2px" name="alive" value="${(model.alive)!}">
						<option value=""></option>
						<#if model.alive?? && model.alive == "0">
							<option value="0" selected>生存</option>
							<option value="1">死亡</option>
						<#elseif model.alive?? && model.alive == "1">
							<option value="0">生存</option>
							<option value="1" selected>死亡</option>
						<#else>
							<option value="0">生存</option>
							<option value="1">死亡</option>
						</#if>
					</select>
				</dd>
			</dl>
			<dl>
				<dt>进展时间：</dt>
				<dd><input name="progressDt" type="text" class="date" value="${(model.progressDt)!}"/></dd>
			</dl>
			<dl>
				<dt>放疗次数：</dt>
				<dd><input name="deliveredFraction" type="text" value="${(model.deliveredFraction)!}"/></dd>
			</dl>
			<dl>
				<dt>治疗类型：</dt>
				<dd>
					<select style="margin-right:3px; font-size: 12px; width: 152px; padding: 2px 2px 2px 2px" name="treatType" value="${(model.treatType)!}">
						<option value=""></option>
						<#if model.treatType?? && model.treatType == "0">
							<option value="0" selected>同步</option>
							<option value="1">靶向先</option>
							<option value="2">放疗先</option>
						<#elseif model.alive?? && model.alive == "1">
							<option value="0">同步</option>
							<option value="1" selected>靶向先</option>
							<option value="2">放疗先</option>
						<#elseif model.alive?? && model.alive == "2">
							<option value="0">同步</option>
							<option value="1">靶向先</option>
							<option value="2" selected>放疗先</option>
						<#else>
							<option value="0">同步</option>
							<option value="1">靶向先</option>
							<option value="2">放疗先</option>
						</#if>
					</select>
				</dd>
			</dl>
			<dl>
				<dt>是否同步放化疗：</dt>
				<dd>
					<select style="margin-right:3px; font-size: 12px; width: 152px; padding: 2px 2px 2px 2px" name="synchronous" value="${(model.synchronous)!}">
						<option value=""></option>
						<#if model.synchronous?? && model.synchronous == "0">
							<option value="0" selected>否</option>
							<option value="1">是</option>
						<#elseif model.synchronous?? && model.synchronous == "1">
							<option value="0">否</option>
							<option value="1" selected>是</option>
						<#else>
							<option value="0">否</option>
							<option value="1">是</option>
						</#if>
					</select>
				</dd>
			</dl>
			<dl>
				<dt>放疗转移部位数量：</dt>
				<dd><input name="metastasisSites" type="text" value="${(model.metastasisSites)!}"/></dd>
			</dl>
			<dl>
				<dt>是否为多部位放疗：</dt>
				<dd>
					<select style="margin-right:3px; font-size: 12px; width: 152px; padding: 2px 2px 2px 2px" name="isMultiSites" value="${(model.isMultiSites)!}">
						<option value=""></option>
						<#if model.isMultiSites?? && model.isMultiSites == "0">
							<option value="0" selected>否</option>
							<option value="1">是</option>
						<#elseif model.isMultiSites?? && model.isMultiSites == "1">
							<option value="0">否</option>
							<option value="1" selected>是</option>
						<#else>
							<option value="0">否</option>
							<option value="1">是</option>
						</#if>
					</select>
				</dd>
			</dl>
			<dl>
				<dt>有无肺部放疗：</dt>
				<dd>
					<select style="margin-right:3px; font-size: 12px; width: 152px; padding: 2px 2px 2px 2px" name="isPulmonaryRadiation" value="${(model.isPulmonaryRadiation)!}">
						<option value=""></option>
						<#if model.isPulmonaryRadiation?? && model.isPulmonaryRadiation == "0">
							<option value="0" selected>无</option>
							<option value="1">有</option>
						<#elseif model.isPulmonaryRadiation?? && model.isPulmonaryRadiation == "1">
							<option value="0">无</option>
							<option value="1" selected>有</option>
						<#else>
							<option value="0">无</option>
							<option value="1">有</option>
						</#if>
					</select>
				</dd>
			</dl>
			<dl>
				<dt>肺转移放疗：</dt>
				<dd><input name="pulmonaryMetastasisRadiation" type="text" value="${(model.pulmonaryMetastasisRadiation)!}"/></dd>
			</dl>
			<dl>
				<dt>有无脑转移：</dt>
				<dd>
					<select style="margin-right:3px; font-size: 12px; width: 152px; padding: 2px 2px 2px 2px" name="isBrainMetastases" value="${(model.isBrainMetastases)!}">
						<option value=""></option>
						<#if model.isBrainMetastases?? && model.isBrainMetastases == "0">
							<option value="0" selected>无</option>
							<option value="1">有</option>
						<#elseif model.isBrainMetastases?? && model.isBrainMetastases == "1">
							<option value="0">无</option>
							<option value="1" selected>有</option>
						<#else>
							<option value="0">无</option>
							<option value="1">有</option>
						</#if>
					</select>
				</dd>
			</dl>
			<dl>
				<dt>有无脑放疗：</dt>
				<dd>
					<select style="margin-right:3px; font-size: 12px; width: 152px; padding: 2px 2px 2px 2px" name="isBrainRadiation" value="${(model.isBrainRadiation)!}">
						<option value=""></option>
						<#if model.isBrainRadiation?? && model.isBrainRadiation == "0">
							<option value="0" selected>无</option>
							<option value="1">有</option>
						<#elseif model.isBrainRadiation?? && model.isBrainRadiation == "1">
							<option value="0">无</option>
							<option value="1" selected>有</option>
						<#else>
							<option value="0">无</option>
							<option value="1">有</option>
						</#if>
					</select>
				</dd>
			</dl>
			<dl>
				<dt>脑转移放疗：</dt>
				<dd><input name="brainMetastasisRadiation" type="text" value="${(model.brainMetastasisRadiation)!}"/></dd>
			</dl>
			<dl>
				<dt>有无骨转移：</dt>
				<dd>
					<select style="margin-right:3px; font-size: 12px; width: 152px; padding: 2px 2px 2px 2px" name="isBoneMetastases" value="${(model.isBoneMetastases)!}">
						<option value=""></option>
						<#if model.isBoneMetastases?? && model.isBoneMetastases == "0">
							<option value="0" selected>无</option>
							<option value="1">有</option>
						<#elseif model.isBoneMetastases?? && model.isBoneMetastases == "1">
							<option value="0">无</option>
							<option value="1" selected>有</option>
						<#else>
							<option value="0">无</option>
							<option value="1">有</option>
						</#if>
					</select>
				</dd>
			</dl>
			<dl>
				<dt>有无骨放疗：</dt>
				<dd>
					<select style="margin-right:3px; font-size: 12px; width: 152px; padding: 2px 2px 2px 2px" name="isBoneRadiation" value="${(model.isBoneRadiation)!}">
						<option value=""></option>
						<#if model.isBoneRadiation?? && model.isBoneRadiation == "0">
							<option value="0" selected>无</option>
							<option value="1">有</option>
						<#elseif model.isBoneRadiation?? && model.isBoneRadiation == "1">
							<option value="0">无</option>
							<option value="1" selected>有</option>
						<#else>
							<option value="0">无</option>
							<option value="1">有</option>
						</#if>
					</select>
				</dd>
			</dl>
			<dl>
				<dt>骨转移放疗：</dt>
				<dd><input name="boneMetastasisRadiation" type="text" value="${(model.boneMetastasisRadiation)!}"/></dd>
			</dl>
			<dl>
				<dt>肾上腺转移放疗：</dt>
				<dd><input name="adrenalMetastasisRadiation" type="text" value="${(model.adrenalMetastasisRadiation)!}"/></dd>
			</dl>
			<dl>
				<dt>其他转移放疗：</dt>
				<dd><input name="otherMetastasisRadiation" type="text" value="${(model.otherMetastasisRadiation)!}"/></dd>
			</dl>
			<dl>
				<dt>胸放与诊断时间时序：</dt>
				<dd><input name="cmdTimeSeq" type="text" value="${(model.cmdTimeSeq)!}"/></dd>
			</dl>
			<dl>
				<dt>胸放与系统治疗时序：</dt>
				<dd><input name="cmsTimeSeq" type="text" value="${(model.cmsTimeSeq)!}"/></dd>
			</dl>
			<dl>
				<dt>放射性副反应：</dt>
				<dd><input name="sideReaction" type="text" value="${(model.sideReaction)!}"/></dd>
			</dl>
			<dl>
				<dt>TKI是否为一线用药：</dt>
				<dd>
					<select style="margin-right:3px; font-size: 12px; width: 152px; padding: 2px 2px 2px 2px" name="tki" value="${(model.tki)!}">
						<option value=""></option>
						<#if model.tki?? && model.tki == "0">
							<option value="0" selected>否</option>
							<option value="1">是</option>
						<#elseif model.tki?? && model.tki == "1">
							<option value="0">否</option>
							<option value="1" selected>是</option>
						<#else>
							<option value="0">否</option>
							<option value="1">是</option>
						</#if>
					</select>
				</dd>
			</dl>
			<dl>
				<dt>Platinum doublet：</dt>
				<dd>
					<select style="margin-right:3px; font-size: 12px; width: 152px; padding: 2px 2px 2px 2px" name="platinumDoublet" value="${(model.platinumDoublet)!}">
						<option value=""></option>
						<#if model.platinumDoublet?? && model.platinumDoublet == "0">
							<option value="0" selected>否</option>
							<option value="1">是</option>
						<#elseif model.platinumDoublet?? && model.platinumDoublet == "1">
							<option value="0">否</option>
							<option value="1" selected>是</option>
						<#else>
							<option value="0">否</option>
							<option value="1">是</option>
						</#if>
					</select>
				</dd>
			</dl>
			<dl>
				<dt>是否用吉非替尼：</dt>
				<dd>
					<select style="margin-right:3px; font-size: 12px; width: 152px; padding: 2px 2px 2px 2px" name="gefitinib" value="${(model.gefitinib)!}">
						<option value=""></option>
						<#if model.gefitinib?? && model.gefitinib == "0">
							<option value="0" selected>否</option>
							<option value="1">是</option>
						<#elseif model.gefitinib?? && model.gefitinib == "1">
							<option value="0">否</option>
							<option value="1" selected>是</option>
						<#else>
							<option value="0">否</option>
							<option value="1">是</option>
						</#if>
					</select>
				</dd>
			</dl>
			<dl>
				<dt>是否用厄洛替尼：</dt>
				<dd>
					<select style="margin-right:3px; font-size: 12px; width: 152px; padding: 2px 2px 2px 2px" name="angiostatin" value="${(model.angiostatin)!}">
						<option value=""></option>
						<#if model.angiostatin?? && model.angiostatin == "0">
							<option value="0" selected>否</option>
							<option value="1">是</option>
						<#elseif model.angiostatin?? && model.angiostatin == "1">
							<option value="0">否</option>
							<option value="1" selected>是</option>
						<#else>
							<option value="0">否</option>
							<option value="1">是</option>
						</#if>
					</select>
				</dd>
			</dl>
			<dl>
				<dt>是否用埃克替尼：</dt>
				<dd>
					<select style="margin-right:3px; font-size: 12px; width: 152px; padding: 2px 2px 2px 2px" name="icotinib" value="${(model.icotinib)!}">
						<option value=""></option>
						<#if model.icotinib?? && model.icotinib == "0">
							<option value="0" selected>否</option>
							<option value="1">是</option>
						<#elseif model.icotinib?? && model.icotinib == "1">
							<option value="0">否</option>
							<option value="1" selected>是</option>
						<#else>
							<option value="0">否</option>
							<option value="1">是</option>
						</#if>
					</select>
				</dd>
			</dl>
			<dl>
				<dt>全身治疗方案1：</dt>
				<dd><input name="holisticTx1" type="text" value="${(model.holisticTx1)!}"/></dd>
			</dl>
			<dl>
				<dt>全身治疗方案2：</dt>
				<dd><input name="holisticTx2" type="text" value="${(model.holisticTx2)!}"/></dd>
			</dl>
			<dl>
				<dt>全身治疗方案3：</dt>
				<dd><input name="holisticTx3" type="text" value="${(model.holisticTx3)!}"/></dd>
			</dl>
			<dl>
				<dt>全身治疗方案4：</dt>
				<dd><input name="holisticTx4" type="text" value="${(model.holisticTx4)!}"/></dd>
			</dl>
			<dl>
				<dt>全身治疗方案5：</dt>
				<dd><input name="holisticTx5" type="text" value="${(model.holisticTx5)!}"/></dd>
			</dl>
			<dl>
				<dt>全身治疗方案6：</dt>
				<dd><input name="holisticTx6" type="text" value="${(model.holisticTx6)!}"/></dd>
			</dl>
			<dl>
				<dt>全身治疗方案7：</dt>
				<dd><input name="holisticTx7" type="text" value="${(model.holisticTx7)!}"/></dd>
			</dl>

		</div>
	</div>
</form>