 
<form method="post" action="galactophore/save.do" class="pageForm required-validate" onsubmit="return saveGalactophore(this);">
	<input name="id" type="hidden" value="${(model.id)!}" />
	<input name="treatCourseId" type="hidden" value="${(model.treatCourseId)!}" />
	<div class="formBar">
		<ul>
			<li><button type="submit" class="buttonActive">保存</button></li>
			<li><button type="button" class="button close">取消</button></li>
		</ul>
	</div>
	<div class="pageContent">
		<div class="pageFormContent" layoutH="75">
			<div>
				<dl>
					<dt>初潮年龄：</dt>
					<dd><input name="menarcheAge" type="text" value="${(model.menarcheAge)!}"/></dd>
				</dl>
				<dl>
					<dt>闭经年龄：</dt>
					<dd><input name="amenorrheaAge" type="text" value="${(model.amenorrheaAge)!}"/></dd>
				</dl>
				<dl>
					<dt>分子分型：</dt>
					<dd><input name="molecularSubtyping" type="text" value="${(model.molecularSubtyping)!}"/></dd>
				</dl>
				<dl>
					<dt>ER：</dt>
					<dd><input name="er" type="text" value="${(model.er)!}"/></dd>
				</dl>
				<dl>
					<dt>PR：</dt>
					<dd><input name="pr" type="text" value="${(model.pr)!}"/></dd>
				</dl>
				<dl>
					<dt>Her-2：</dt>
					<dd><input name="her2" type="text" value="${(model.her2)!}"/></dd>
				</dl>
				<dl>
					<dt>Ki-67：</dt>
					<dd><input name="ki67" type="text" value="${(model.ki67)!}"/></dd>
				</dl>
				<dl>
					<dt>分期：</dt>
					<dd><input name="stage" type="text" value="${(model.stage)!}"/></dd>
				</dl>
				<dl>
					<dt>分期TNM：</dt>
					<dd><input name="stageTNM" type="text" value="${(model.stageTNM)!}"/></dd>
				</dl>
				<dl>
					<dt>手术方式：</dt>
					<dd><input name="surgeryMode" type="text" value="${(model.surgeryMode)!}"/></dd>
				</dl>
				<dl>
					<dt>FISH扩增：</dt>
					<dd><input name="fishAugmentation" type="text" value="${(model.fishAugmentation)!}"/></dd>
				</dl>
				<dl>
					<dt>基因检测：</dt>
					<dd><input name="geneticTest" type="text" value="${(model.geneticTest)!}"/></dd>
				</dl>
				<dl>
					<dt>STEEP评分：</dt>
					<dd><input name="steepGrade" type="text" value="${(model.steepGrade)!}"/></dd>
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
					<dt>有无胸壁/乳腺放疗：</dt>
					<dd>
						<select style="margin-right:3px; font-size: 12px; width: 152px; padding: 2px 2px 2px 2px" name="isGalactophoreRadiation" value="${(model.isGalactophoreRadiation)!}">
							<option value=""></option>
							<#if model.isGalactophoreRadiation?? && model.isGalactophoreRadiation == "0">
								<option value="0" selected>无</option>
								<option value="1">有</option>
							<#elseif model.isGalactophoreRadiation?? && model.isGalactophoreRadiation == "1">
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
					<dt>胸壁放疗时间、范围及剂量：</dt>
					<dd><input name="galactophoreRadiation" type="text" value="${(model.galactophoreRadiation)!}"/></dd>
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
					<dt>有无肝转移：</dt>
					<dd>
						<select style="margin-right:3px; font-size: 12px; width: 152px; padding: 2px 2px 2px 2px" name="isHepaticMetastases" value="${(model.isHepaticMetastases)!}">
							<option value=""></option>
							<#if model.isHepaticMetastases?? && model.isHepaticMetastases == "0">
								<option value="0" selected>无</option>
								<option value="1">有</option>
							<#elseif model.isHepaticMetastases?? && model.isHepaticMetastases == "1">
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
					<dt>肾上腺转移放疗：</dt>
					<dd><input name="adrenalMetastasisRadiation" type="text" value="${(model.adrenalMetastasisRadiation)!}"/></dd>
				</dl>
				<dl>
					<dt>其他转移放疗：</dt>
					<dd><input name="otherMetastasisRadiation" type="text" value="${(model.otherMetastasisRadiation)!}"/></dd>
				</dl>
				<dl>
					<dt>是否用抗Her-2药物：</dt>
					<dd>
						<select style="margin-right:3px; font-size: 12px; width: 152px; padding: 2px 2px 2px 2px" name="her2Drug" value="${(model.her2Drug)!}">
							<option value=""></option>
							<#if model.her2Drug?? && model.her2Drug == "0">
								<option value="0" selected>否</option>
								<option value="1">是</option>
							<#elseif model.her2Drug?? && model.her2Drug == "1">
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
					<dt>是否用内分泌：</dt>
					<dd>
						<select style="margin-right:3px; font-size: 12px; width: 152px; padding: 2px 2px 2px 2px" name="incretion" value="${(model.incretion)!}">
							<option value=""></option>
							<#if model.incretion?? && model.incretion == "0">
								<option value="0" selected>否</option>
								<option value="1">是</option>
							<#elseif model.incretion?? && model.incretion == "1">
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
					<dt>是否用免疫：</dt>
					<dd>
						<select style="margin-right:3px; font-size: 12px; width: 152px; padding: 2px 2px 2px 2px" name="immunized" value="${(model.immunized)!}">
							<option value=""></option>
							<#if model.immunized?? && model.immunized == "0">
								<option value="0" selected>否</option>
								<option value="1">是</option>
							<#elseif model.immunized?? && model.immunized == "1">
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
					<dt>初次靶向应用时间：</dt>
					<dd><input name="firstTargetUseDate" type="text" class="date" value="${(model.firstTargetUseDate)!}"/></dd>
				</dl>
				<dl>
					<dt>初次靶向放疗时间：</dt>
					<dd><input name="firstTargetTreatDate" type="text" class="date" value="${(model.firstTargetTreatDate)!}"/></dd>
				</dl>
				<dl>
					<dt>KPS：</dt>
					<dd><input name="kps" type="text" value="${(model.kps)!}"/></dd>
				</dl>
				<dl>
					<dt>NRS2002：</dt>
					<dd><input name="nrs2002" type="text" value="${(model.nrs2002)!}"/></dd>
				</dl>
				<dl>
					<dt>NRS：</dt>
					<dd><input name="nrs" type="text" value="${(model.nrs)!}"/></dd>
				</dl>
				<dl>
					<dt>APRINT：</dt>
					<dd><input name="aprint" type="text" value="${(model.aprint)!}"/></dd>
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
				<dl>
					<dt>备用字段1：</dt>
					<dd><input name="backup1" type="text" value="${(model.backup1)!}"/></dd>
				</dl>
				<dl>
					<dt>备用字段2：</dt>
					<dd><input name="backup2" type="text" value="${(model.backup2)!}"/></dd>
				</dl>
				<dl>
					<dt>备用字段3：</dt>
					<dd><input name="backup3" type="text" value="${(model.backup3)!}"/></dd>
				</dl>
				<dl>
					<dt>备用字段4：</dt>
					<dd><input name="backup4" type="text" value="${(model.backup4)!}"/></dd>
				</dl>
				<dl>
					<dt>备用字段5：</dt>
					<dd><input name="backup5" type="text" value="${(model.backup5)!}"/></dd>
				</dl>
				<dl>
					<dt>备用字段6：</dt>
					<dd><input name="backup6" type="text" value="${(model.backup6)!}"/></dd>
				</dl>
				<dl>
					<dt>备用字段7：</dt>
					<dd><input name="backup7" type="text" value="${(model.backup7)!}"/></dd>
				</dl>
				<dl>
					<dt>备用字段8：</dt>
					<dd><input name="backup8" type="text" value="${(model.backup8)!}"/></dd>
				</dl>
				<dl>
					<dt>备用字段9：</dt>
					<dd><input name="backup9" type="text" value="${(model.backup9)!}"/></dd>
				</dl>
				<dl>
					<dt>备用字段10：</dt>
					<dd><input name="backup10" type="text" value="${(model.backup10)!}"/></dd>
				</dl>
			</div>
			<div class="divider"></div>
			<div class="panel" minH="80">
				<h1>多原发</h1>
				<div>
					<table class="list nowrap itemDetail" addButton="新建" width="100%">
						<thead>
						<tr>
							<th type="text" name="multiPrimaryList[#index#].primary" fieldClass="required"
									size="20">原发病种
							</th>
							<th type="text" name="multiPrimaryList[#index#].bodypart" size="20">部位</th>
							<th type="date" format="yyyy-MM-dd" name="multiPrimaryList[#index#].diagnosisDate"
									size="20">诊断时间
							</th>
							<th type="del" width="60">操作</th>
						</tr>
						</thead>
						<tbody>
						<#assign primaryIndex = 0>
						<#list multiPrimaryDtoList as multiPrimary>
							<tr class="unitBox">
								<td><input type="text" name="multiPrimaryList[${primaryIndex!}].primary" value="${(multiPrimary.primary)!}" class="required textInput" size="20"></td>
								<td><input type="text" name="multiPrimaryList[${primaryIndex!}].bodypart" value="${(multiPrimary.bodypart)!}" class="required textInput" size="20"></td>
								<td><input type="text" name="multiPrimaryList[${primaryIndex!}].diagnosisDate" value="${(multiPrimary.diagnosisDate)!}" class="date  textInput" datefmt="yyyy-MM-dd" size="20">
									<a class="inputDateButton" href="javascript:void(0)">选择</a></td>
								<td><a href="javascript:void(0)" class="btnDel ">删除</a></td>
							</tr>
							<#assign primaryIndex++>
						</#list>
						</tbody>
					</table>
				</div>
			</div>
			<div class="panel" minH="80">
				<h1>是否接受过治疗</h1>
				<div>
					<table class="list nowrap itemDetail" addButton="新建" width="100%">
						<thead>
						<tr>
							<th type="enum" name="treatHistoryList[#index#].treatType" enumUrl="treatcourse/treat_history_type/list" size="30">治疗类型</th>
							<th type="text" name="treatHistoryList[#index#].plan" fieldClass="required"
									size="20">方案
							</th>
							<th type="date" format="yyyy-MM-dd" name="treatHistoryList[#index#].treatDate"
									size="20">时间
							</th>
							<th type="del" width="60">操作</th>
						</tr>
						</thead>
						<tbody>
						<#assign treatHistoryIndex = 0>
						<#list treatHistoryDtoList as dto>
							<tr class="unitBox">
								<td>
									<select style="margin-right:3px; font-size: 12px; width: 130px; padding: 2px 2px 2px 2px" name="treatHistoryList[${treatHistoryIndex!}].treatType" value="${(dto.treatType)!}">
										<#if (dto.treatType)?? && dto.treatType == "immunotherapy">
											<option value="immunotherapy" selected>免疫</option>
										<#else>
											<option value="immunotherapy">免疫</option>
										</#if>
										<#if (dto.treatType)?? && dto.treatType == "radiation">
											<option value="radiation" selected>放射</option>
										<#else>
											<option value="radiation">放射</option>
										</#if>
										<#if (dto.treatType)?? && dto.treatType == "chemotherapy">
											<option value="chemotherapy" selected>化疗</option>
										<#else>
											<option value="chemotherapy">化疗</option>
										</#if>
										<#if (dto.treatType)?? && dto.treatType == "surgery">
											<option value="surgery" selected>手术</option>
										<#else>
											<option value="surgery">手术</option>
										</#if>
										<#if (dto.treatType)?? && dto.treatType == "target">
											<option value="target" selected>靶向治疗</option>
										<#else>
											<option value="target">靶向治疗</option>
										</#if>
										<#if (dto.treatType)?? && dto.treatType == "incretion">
											<option value="incretion" selected>内分泌治疗</option>
										<#else>
											<option value="incretion">内分泌治疗</option>
										</#if>
									</select>
								</td>
								<td><input type="text" name="treatHistoryList[${treatHistoryIndex!}].plan" value="${(dto.plan)!}" class="required textInput" size="20"></td>
								<td><input type="text" name="treatHistoryList[${treatHistoryIndex!}].treatDate" value="${(dto.treatDate)!}" class="date textInput" datefmt="yyyy-MM-dd" size="20">
									<a class="inputDateButton" href="javascript:void(0)">选择</a></td>
								<td><a href="javascript:void(0)" class="btnDel ">删除</a></td>
							</tr>
							<#assign treatHistoryIndex++>
						</#list>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</form>