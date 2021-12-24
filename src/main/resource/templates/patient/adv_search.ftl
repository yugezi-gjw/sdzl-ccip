<form method="post" action="patient/list" class="pageForm" onsubmit="return navTabSearch(this);">
  <div class="formBar">
    <ul>
      <li><button type="submit" class="buttonActive">开始检索</button></li>
      <li><button type="reset">清空重输</button></li>
    </ul>
  </div>
<div class="tabs">
  <div class="tabsHeader">
    <div class="tabsHeaderContent">
      <ul>
        <li><a href="javascript:;"><span>基本条件</span></a></li>
        <li><a href="javascript:;"><span>按病种查询</span></a></li>
      </ul>
    </div>
  </div>
  <div class="tabsContent">
<#--    <div>-->
      <div>
          <div class="pageFormContent">
            <dl>
              <dt>患者姓名：</dt>
              <dd><input name="patientName" type="text" size="25" value="${(model.patientName)!}"/></dd>
            </dl>
            <dl>
              <dt>住 院 号：</dt>
              <dd><input name="inpatientId" type="text" size="25" value="${(model.inpatientId)!}"/></dd>
            </dl>
            <dl>
              <dt>性 别：</dt>
              <dd>
                <select style="margin-right:3px; font-size: 12px; width: 182px; padding: 2px 2px 2px 2px"
                        name="gender" value="${(model.gender)!}">
                  <option value=""></option>
                  <option value="1">男</option>
                  <option value="2">女</option>
                </select>
              </dd>
            </dl>
            <dl>
              <dt>身份证号：</dt>
              <dd><input name="nationalId" type="text" size="25" value="${(model.nationalId)!}"/></dd>
            </dl>
            <div class="divider">divider</div>

            <dl>
              <dt>分 期：</dt>
              <dd><input name="stage" type="text" size="25" value="${(model.stage)!}"/></dd>
            </dl>
            <dl>
              <dt>诊断日期：</dt>
              <dd><input name="diagnosisDt" type="text" size="25" class="date"
                         value="${(model.diagnosisDt)!}"/></dd>
            </dl>
            <dl>
              <dt>准确死亡日期：</dt>
              <dd><input name="deathDt" type="text" size="25" class="date" value="${(model.deathDt)!}"/>
              </dd>
            </dl>
            <dl>
              <dt>最近一次住院：</dt>
              <dd><input name="lastInpatientDt" type="text" size="25" class="date"
                         value="${(model.lastInpatientDt)!}"/></dd>
            </dl>
            <dl>
              <dt>准确OS：</dt>
              <dd><input name="accurateOs" type="text" size="25" value="${(model.accurateOs)!}"/></dd>
            </dl>
            <dl>
              <dt>生存状态：</dt>
              <dd>
                <select style="margin-right:3px; font-size: 12px; width: 182px; padding: 2px 2px 2px 2px"
                        name="alive" value="${(model.alive)!}">
                  <option value=""></option>
                  <option value="0">生存</option>
                  <option value="1">死亡</option>
                </select>
              </dd>
            </dl>
            <dl>
              <dt>进展时间：</dt>
              <dd><input name="progressDt" type="text" size="25" class="date"
                         value="${(model.progressDt)!}"/></dd>
            </dl>
            <dl>
              <dt>放疗次数：</dt>
              <dd><input name="deliveredFraction" type="text" size="25"
                         value="${(model.deliveredFraction)!}"/></dd>
            </dl>
            <dl>
              <dt>放疗转移部位数量：</dt>
              <dd><input name="metastasisSites" type="text" size="25"
                         value="${(model.metastasisSites)!}"/></dd>
            </dl>
            <dl>
              <dt>是否为多部位放疗：</dt>
              <dd>
                <select style="margin-right:3px; font-size: 12px; width: 182px; padding: 2px 2px 2px 2px"
                        name="isMultiSites" value="${(model.isMultiSites)!}">
                  <option value=""></option>
                  <option value="1">是</option>
                  <option value="0">否</option>
                </select>
              </dd>
            </dl>
            <dl>
              <dt>有无脑转移：</dt>
              <dd>
                <select style="margin-right:3px; font-size: 12px; width: 182px; padding: 2px 2px 2px 2px"
                        name="isBrainMetastases" value="${(model.isBrainMetastases)!}">
                  <option value=""></option>
                  <option value="1">有</option>
                  <option value="0">无</option>
                </select>
              </dd>
            </dl>
            <dl>
              <dt>有无脑放疗：</dt>
              <dd>
                <select style="margin-right:3px; font-size: 12px; width: 182px; padding: 2px 2px 2px 2px"
                        name="isBrainRadiation" value="${(model.isBrainRadiation)!}">
                  <option value=""></option>
                  <option value="1">有</option>
                  <option value="0">无</option>
                </select>
              </dd>
            </dl>
            <dl>
              <dt>脑转移放疗：</dt>
              <dd>
                <input name="brainMetastasisRadiation" type="text" size="25"
                       value="${(model.brainMetastasisRadiation)!}"/>
              </dd>
            </dl>
            <dl>
              <dt>有无骨转移：</dt>
              <dd>
                <select style="margin-right:3px; font-size: 12px; width: 182px; padding: 2px 2px 2px 2px"
                        name="isBoneMetastases" value="${(model.isBoneMetastases)!}">
                  <option value=""></option>
                  <option value="1">有</option>
                  <option value="0">无</option>
                </select>
              </dd>
            </dl>
            <dl>
              <dt>有无骨放疗：</dt>
              <dd>
                <select style="margin-right:3px; font-size: 12px; width: 182px; padding: 2px 2px 2px 2px"
                        name="isBoneRadiation" value="${(model.isBoneRadiation)!}">
                  <option value=""></option>
                  <option value="1">有</option>
                  <option value="0">无</option>
                </select>
              </dd>
            </dl>
            <dl>
              <dt>骨转移放疗：</dt>
              <dd>
                <input name="boneMetastasisRadiation" type="text" size="25"
                       value="${(model.boneMetastasisRadiation)!}"/>
              </dd>
            </dl>
            <dl>
              <dt>肾上腺转移放疗：</dt>
              <dd>
                <input name="adrenalMetastasisRadiation" type="text" size="25"
                       value="${(model.adrenalMetastasisRadiation)!}"/>
              </dd>
            </dl>
            <dl>
              <dt>其他转移放疗：</dt>
              <dd>
                <input name="otherMetastasisRadiation" type="text" size="25"
                       value="${(model.otherMetastasisRadiation)!}"/>
              </dd>
            </dl>
            <dl>
              <dt>全身治疗方案1：</dt>
              <dd>
                <input name="holisticTx1" type="text" size="25" value="${(model.holisticTx1)!}"/>
              </dd>
            </dl>
            <dl>
              <dt>全身治疗方案2：</dt>
              <dd>
                <input name="holisticTx2" type="text" size="25" value="${(model.holisticTx2)!}"/>
              </dd>
            </dl>
            <dl>
              <dt>全身治疗方案3：</dt>
              <dd>
                <input name="holisticTx3" type="text" size="25" value="${(model.holisticTx3)!}"/>
              </dd>
            </dl>
            <dl>
              <dt>全身治疗方案4：</dt>
              <dd>
                <input name="holisticTx4" type="text" size="25" value="${(model.holisticTx4)!}"/>
              </dd>
            </dl>
            <dl>
              <dt>全身治疗方案5：</dt>
              <dd>
                <input name="holisticTx5" type="text" size="25" value="${(model.holisticTx5)!}"/>
              </dd>
            </dl>
            <dl>
              <dt>全身治疗方案6：</dt>
              <dd>
                <input name="holisticTx6" type="text" size="25" value="${(model.holisticTx6)!}"/>
              </dd>
            </dl>
            <dl>
              <dt>全身治疗方案7：</dt>
              <dd>
                <input name="holisticTx7" type="text" size="25" value="${(model.holisticTx7)!}"/>
              </dd>
            </dl>
          </div>
      </div>
<#--    </div>-->
    <div>
      <div class="pageFormContent">
        <dl>
          <dt>部   位：</dt>
          <dd>
            <input type="radio" name="bodypart" value="chest" checked="checked" onclick="changeBodypart(this.value);"/>肺
            <input type="radio" name="bodypart" value="galactophore" onclick="changeBodypart(this.value);"/>乳腺
          </dd>
        </dl>
      </div>

      <div id="chestDiv" class="pageFormContent" style="display: block;">
        <dl>
          <dt>EGFR基因突变：</dt>
          <dd>
            <input name="egfr" type="text" size="25" value="${(model.egfr)!}"/>
          </dd>
        </dl>
        <dl>
          <dt>治疗类型：</dt>
          <dd>
            <select style="margin-right:3px; font-size: 12px; width: 182px; padding: 2px 2px 2px 2px"
                    name="treatType" value="${(model.treatType)!}">
              <option value=""></option>
              <option value="1">靶向先</option>
              <option value="2">放疗先</option>
              <option value="0">同步</option>
            </select>
          </dd>
        </dl>
        <dl>
          <dt>是否同步放化疗：</dt>
          <dd>
            <select style="margin-right:3px; font-size: 12px; width: 182px; padding: 2px 2px 2px 2px"
                    name="synchronous" value="${(model.synchronous)!}">
              <option value=""></option>
              <option value="1">是</option>
              <option value="0">否</option>
            </select>
          </dd>
        </dl>
        <dl>
          <dt>有无肺部放疗：</dt>
          <dd>
            <select style="margin-right:3px; font-size: 12px; width: 182px; padding: 2px 2px 2px 2px"
                    name="isPulmonaryRadiation" value="${(model.isPulmonaryRadiation)!}">
              <option value=""></option>
              <option value="1">有</option>
              <option value="0">无</option>
            </select>
          </dd>
        </dl>
        <dl>
          <dt>肺转移放疗：</dt>
          <dd>
            <input name="pulmonaryMetastasisRadiation" type="text" size="25"
                   value="${(model.pulmonaryMetastasisRadiation)!}"/>
          </dd>
        </dl>
        <dl>
          <dt>胸放与诊断时间时序：</dt>
          <dd>
            <input name="cmdTimeSeq" type="text" size="25" value="${(model.cmdTimeSeq)!}"/>
          </dd>
        </dl>
        <dl>
          <dt>胸放与系统治疗时序：</dt>
          <dd>
            <input name="cmsTimeSeq" type="text" size="25" value="${(model.cmsTimeSeq)!}"/>
          </dd>
        </dl>
        <dl>
          <dt>放射性副反应：</dt>
          <dd>
            <input name="sideReaction" type="text" size="25" value="${(model.sideReaction)!}"/>
          </dd>
        </dl>
        <dl>
          <dt>TKI是否为一线用药：</dt>
          <dd>
            <select style="margin-right:3px; font-size: 12px; width: 182px; padding: 2px 2px 2px 2px"
                    name="tki" value="${(model.tki)!}">
              <option value=""></option>
              <option value="1">是</option>
              <option value="0">否</option>
            </select>
          </dd>
        </dl>
        <dl>
          <dt>Platinum doublet：</dt>
          <dd>
            <select style="margin-right:3px; font-size: 12px; width: 182px; padding: 2px 2px 2px 2px"
                    name="platinumDoublet" value="${(model.platinumDoublet)!}">
              <option value=""></option>
              <option value="1">是</option>
              <option value="0">否</option>
            </select>
          </dd>
        </dl>
        <dl>
          <dt>是否用吉非替尼：</dt>
          <dd>
            <select style="margin-right:3px; font-size: 12px; width: 182px; padding: 2px 2px 2px 2px"
                    name="gefitinib" value="${(model.gefitinib)!}">
              <option value=""></option>
              <option value="1">是</option>
              <option value="0">否</option>
            </select>
          </dd>
        </dl>
        <dl>
          <dt>是否用厄洛替尼：</dt>
          <dd>
            <select style="margin-right:3px; font-size: 12px; width: 182px; padding: 2px 2px 2px 2px"
                    name="angiostatin" value="${(model.angiostatin)!}">
              <option value=""></option>
              <option value="1">是</option>
              <option value="0">否</option>
            </select>
          </dd>
        </dl>
        <dl>
          <dt>是否用埃克替尼：</dt>
          <dd>
            <select style="margin-right:3px; font-size: 12px; width: 182px; padding: 2px 2px 2px 2px"
                    name="icotinib" value="${(model.icotinib)!}">
              <option value=""></option>
              <option value="1">是</option>
              <option value="0">否</option>
            </select>
          </dd>
        </dl>
      </div>

      <div id="galactophoreDiv" class="pageFormContent" style="display: none;">
        <dl>
          <dt>初潮年龄：</dt>
          <dd>
            <input name="menarcheAge" type="text" size="25" value="${(model.menarcheAge)!}"/>
          </dd>
        </dl>
        <dl>
          <dt>闭经年龄：</dt>
          <dd>
            <input name="amenorrheaAge" type="text" size="25" value="${(model.amenorrheaAge)!}"/>
          </dd>
        </dl>
        <dl>
          <dt>分子分型：</dt>
          <dd>
            <input name="molecularSubtyping" type="text" size="25"
                   value="${(model.molecularSubtyping)!}"/>
          </dd>
        </dl>
        <dl>
          <dt>ER：</dt>
          <dd>
            <input name="er" type="text" size="25" value="${(model.er)!}"/>
          </dd>
        </dl>
        <dl>
          <dt>PR：</dt>
          <dd>
            <input name="pr" type="text" size="25" value="${(model.pr)!}"/>
          </dd>
        </dl>
        <dl>
          <dt>Her-2：</dt>
          <dd>
            <input name="her2" type="text" size="25" value="${(model.her2)!}"/>
          </dd>
        </dl>
        <dl>
          <dt>Ki-67：</dt>
          <dd>
            <input name="ki67" type="text" size="25" value="${(model.ki67)!}"/>
          </dd>
        </dl>
        <dl>
          <dt>手术方式：</dt>
          <dd>
            <input name="surgeryMode" type="text" size="25" value="${(model.surgeryMode)!}"/>
          </dd>
        </dl>
        <dl>
          <dt>FISH扩增：</dt>
          <dd>
            <input name="fishAugmentation" type="text" size="25"
                   value="${(model.fishAugmentation)!}"/>
          </dd>
        </dl>
        <dl>
          <dt>基因检测：</dt>
          <dd>
            <input name="geneticTest" type="text" size="25" value="${(model.geneticTest)!}"/>
          </dd>
        </dl>
        <dl>
          <dt>STEEP评分：</dt>
          <dd>
            <input name="steepGrade" type="text" size="25" value="${(model.steepGrade)!}"/>
          </dd>
        </dl>
        <dl>
          <dt>有无胸壁/乳腺放疗：</dt>
          <dd>
            <select style="margin-right:3px; font-size: 12px; width: 182px; padding: 2px 2px 2px 2px"
                    name="isGalactophoreRadiation" value="${(model.isGalactophoreRadiation)!}">
              <option value=""></option>
              <option value="1">有</option>
              <option value="0">无</option>
            </select>
          </dd>
        </dl>
        <dl>
          <dt>胸壁放疗时间、范围及剂量：</dt>
          <dd>
            <input name="galactophoreRadiation" type="text" size="25"
                   value="${(model.galactophoreRadiation)!}"/>
          </dd>
        </dl>
        <dl>
          <dt>是否用抗Her-2药物：</dt>
          <dd>
            <select style="margin-right:3px; font-size: 12px; width: 182px; padding: 2px 2px 2px 2px"
                    name="her2Drug" value="${(model.her2Drug)!}">
              <option value=""></option>
              <option value="1">是</option>
              <option value="0">否</option>
            </select>
          </dd>
        </dl>
        <dl>
          <dt>是否用内分泌：</dt>
          <dd>
            <select style="margin-right:3px; font-size: 12px; width: 182px; padding: 2px 2px 2px 2px"
                    name="incretion" value="${(model.incretion)!}">
              <option value=""></option>
              <option value="1">是</option>
              <option value="0">否</option>
            </select>
          </dd>
        </dl>
        <dl>
          <dt>是否用免疫：</dt>
          <dd>
            <select style="margin-right:3px; font-size: 12px; width: 182px; padding: 2px 2px 2px 2px"
                    name="immunized" value="${(model.immunized)!}">
              <option value=""></option>
              <option value="1">是</option>
              <option value="0">否</option>
            </select>
          </dd>
        </dl>
      </div>
    </div>
  </div>
</div>
</form>
