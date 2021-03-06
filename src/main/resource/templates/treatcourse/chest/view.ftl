<div class="pageFormContent">
  <dl>
    <dt>分期：</dt>
    <dd><label>${(dto.stage)!}</label></dd>
  </dl>
  <dl>
    <dt>EGFR基因突变：</dt>
    <dd><label>${(dto.egfr)!}</label></dd>
  </dl>
  <dl>
    <dt>准确诊断日期：</dt>
    <dd><label>${(dto.diagnosisDt)!}</label></dd>
  </dl>
  <dl>
    <dt>准确死亡日期：</dt>
    <dd><label>${(dto.deathDt)!}</label></dd>
  </dl>
  <dl>
    <dt>最近一次住院：</dt>
    <dd><label>${(dto.lastInpatientDt)!}</label></dd>
  </dl>
  <dl>
    <dt>准确OS：</dt>
    <dd><label>${(dto.accurateOs)!}</label></dd>
  </dl>
  <dl>
    <dt>生存状态：</dt>
    <dd><label>
            <#if (dto.alive)??>
                <#if dto.alive == "1">
                  死亡
                <#elseif dto.alive == "0">
                  生存
                </#if>
            </#if>
      </label></dd>
  </dl>
  <dl>
    <dt>进展时间：</dt>
    <dd><label>${(dto.progressDt)!}</label></dd>
  </dl>
  <dl>
    <dt>放疗次数：</dt>
    <dd><label>${(dto.deliveredFraction)!}</label></dd>
  </dl>
  <dl>
    <dt>治疗类型：</dt>
    <dd><label>
            <#if (dto.treatType)?? && dto.treatType == "1">
              靶向先
            <#elseif (dto.treatType)?? && dto.treatType == "0">
              同步
            <#elseif (dto.treatType)?? && dto.treatType == "2">
              放疗先
            </#if>
      </label></dd>
  </dl>
  <dl>
    <dt>是否同步：</dt>
    <dd><label>
            <#if (dto.synchronous)??>
                <#if dto.synchronous == "1">
                  是
                <#elseif dto.synchronous == "0">
                  否
                </#if>
            </#if>
      </label></dd>
  </dl>
  <dl>
    <dt>放疗转移部位数量：</dt>
    <dd><label>${(dto.metastasisSites)!}</label></dd>
  </dl>
  <dl>
    <dt>是否为多部位放疗：</dt>
    <dd><label>
            <#if (dto.isMultiSites)??>
                <#if dto.isMultiSites == "1">
                  是
                <#elseif dto.isMultiSites == "0">
                  否
                </#if>
            </#if>
      </label></dd>
  </dl>
  <dl>
    <dt>有无肺部放疗：</dt>
    <dd><label>
            <#if (dto.isPulmonaryRadiation)??>
                <#if dto.isPulmonaryRadiation == "1">
                  有
                <#elseif dto.isPulmonaryRadiation == "0">
                  无
                </#if>
            </#if>
      </label></dd>
  </dl>
  <dl>
    <dt>肺转移放疗：</dt>
    <dd>
      <label style="width: 250px;">${(dto.pulmonaryMetastasisRadiation)!}</label></dd>
  </dl>
  <dl>
    <dt>有无脑转移：</dt>
    <dd><label>
            <#if (dto.isBrainMetastases)??>
                <#if dto.isBrainMetastases == "1">
                  有
                <#elseif dto.isBrainMetastases == "0">
                  无
                </#if>
            </#if>
      </label></dd>
  </dl>
  <dl>
    <dt>有无脑放疗：</dt>
    <dd><label>
            <#if (dto.isBrainRadiation)??>
                <#if dto.isBrainRadiation == "1">
                  有
                <#elseif dto.isBrainRadiation == "0">
                  无
                </#if>
            </#if>
      </label></dd>
  </dl>
  <dl>
    <dt>脑转移放疗：</dt>
    <dd><label style="width: 250px;">${(dto.brainMetastasisRadiation)!}</label></dd>
  </dl>
  <dl>
    <dt>有无骨转移：</dt>
    <dd><label>
            <#if (dto.isBoneMetastases)??>
                <#if dto.isBoneMetastases == "1">
                  有
                <#elseif dto.isBoneMetastases == "0">
                  无
                </#if>
            </#if>
      </label></dd>
  </dl>
  <dl>
    <dt>有无骨放疗：</dt>
    <dd><label>
            <#if (dto.isBoneRadiation)??>
                <#if dto.isBoneRadiation == "1">
                  有
                <#elseif dto.isBoneRadiation == "0">
                  无
                </#if>
            </#if>
      </label></dd>
  </dl>
  <dl>
    <dt>骨转移放疗：</dt>
    <dd><label style="width: 250px;">${(dto.boneMetastasisRadiation)!}</label></dd>
  </dl>
  <dl>
    <dt>肾上腺转移放疗：</dt>
    <dd><label style="width: 250px;">${(dto.adrenalMetastasisRadiation)!}</label></dd>
  </dl>
  <dl>
    <dt>其他转移放疗：</dt>
    <dd><label style="width: 250px;">${(dto.otherMetastasisRadiation)!}</label></dd>
  </dl>
  <dl>
    <dt>胸放与系统治疗时序：</dt>
    <dd><label>${(dto.cmsTimeSeq)!}</label></dd>
  </dl>
  <dl>
    <dt>放射性副反应：</dt>
    <dd><label>${(dto.sideReaction)!}</label></dd>
  </dl>
  <dl>
    <dt>TKI是否为一线用药：</dt>
    <dd><label>
            <#if (dto.tki)??>
                <#if dto.tki == "1">
                  是
                <#elseif dto.tki == "0">
                  否
                </#if>
            </#if>
      </label></dd>
  </dl>
  <dl>
    <dt>Platinum doublet：</dt>
    <dd><label>
            <#if (dto.platinumDoublet)??>
                <#if dto.platinumDoublet == "1">
                  是
                <#elseif dto.platinumDoublet == "0">
                  否
                </#if>
            </#if>
      </label></dd>
  </dl>
  <dl>
    <dt>是否用吉非替尼：</dt>
    <dd><label>
            <#if (dto.gefitinib)??>
                <#if dto.gefitinib == "1">
                  是
                <#elseif dto.gefitinib == "0">
                  否
                </#if>
            </#if>
      </label></dd>
  </dl>
  <dl>
    <dt>是否用厄洛替尼：</dt>
    <dd><label>
            <#if (dto.angiostatin)??>
                <#if dto.angiostatin == "1">
                  是
                <#elseif dto.angiostatin == "0">
                  否
                </#if>
            </#if>
      </label></dd>
  </dl>
  <dl>
    <dt>是否用埃克替尼：</dt>
    <dd><label>
            <#if (dto.icotinib)??>
                <#if dto.icotinib == "1">
                  是
                <#elseif dto.icotinib == "0">
                  否
                </#if>
            </#if>
      </label></dd>
  </dl>
  <dl>
    <dt>初次靶向应用时间：</dt>
    <dd><label style="width: 250px;">${(dto.firstTargetUseDate)!}</label></dd>
  </dl>
  <dl>
    <dt>初次靶向放疗时间：</dt>
    <dd><label style="width: 250px;">${(dto.firstTargetTreatDate)!}</label></dd>
  </dl>
  <dl>
    <dt>KPS：</dt>
    <dd><label style="width: 250px;">${(dto.kps)!}</label></dd>
  </dl>
  <dl>
    <dt>NRS2002：</dt>
    <dd><label style="width: 250px;">${(dto.NRS2002)!}</label></dd>
  </dl>
  <dl>
    <dt>NRS：</dt>
    <dd><label style="width: 250px;">${(dto.NRS)!}</label></dd>
  </dl>
  <dl>
    <dt>APRINT：</dt>
    <dd><label style="width: 250px;">${(dto.APRINT)!}</label></dd>
  </dl>
  <dl>
    <dt>全身治疗方案1：</dt>
    <dd><label style="width: 250px;">${(dto.holisticTx1)!}</label></dd>
  </dl>
  <dl>
    <dt>全身治疗方案2：</dt>
    <dd><label style="width: 250px;">${(dto.holisticTx2)!}</label></dd>
  </dl>
  <dl>
    <dt>全身治疗方案3：</dt>
    <dd><label style="width: 250px;">${(dto.holisticTx3)!}</label></dd>
  </dl>
  <dl>
    <dt>全身治疗方案4：</dt>
    <dd><label style="width: 250px;">${(dto.holisticTx4)!}</label></dd>
  </dl>
  <dl>
    <dt>全身治疗方案5：</dt>
    <dd><label style="width: 250px;">${(dto.holisticTx5)!}</label></dd>
  </dl>
  <dl>
    <dt>全身治疗方案6：</dt>
    <dd><label style="width: 250px;">${(dto.holisticTx6)!}</label></dd>
  </dl>
  <dl>
    <dt>全身治疗方案7：</dt>
    <dd><label style="width: 250px;">${(dto.holisticTx7)!}</label></dd>
  </dl>
  <dl>
    <dt>备用字段1：</dt>
    <dd><label style="width: 250px;">${(dto.backup1)!}</label></dd>
  </dl>
  <dl>
    <dt>备用字段2：</dt>
    <dd><label style="width: 250px;">${(dto.backup2)!}</label></dd>
  </dl>
  <dl>
    <dt>备用字段3：</dt>
    <dd><label style="width: 250px;">${(dto.backup3)!}</label></dd>
  </dl>
  <dl>
    <dt>备用字段4：</dt>
    <dd><label style="width: 250px;">${(dto.backup4)!}</label></dd>
  </dl>
  <dl>
    <dt>备用字段5：</dt>
    <dd><label style="width: 250px;">${(dto.backup5)!}</label></dd>
  </dl>
  <dl>
    <dt>备用字段6：</dt>
    <dd><label style="width: 250px;">${(dto.backup6)!}</label></dd>
  </dl>
  <dl>
    <dt>备用字段7：</dt>
    <dd><label style="width: 250px;">${(dto.backup7)!}</label></dd>
  </dl>
  <dl>
    <dt>备用字段8：</dt>
    <dd><label style="width: 250px;">${(dto.backup8)!}</label></dd>
  </dl>
  <dl>
    <dt>备用字段9：</dt>
    <dd><label style="width: 250px;">${(dto.backup9)!}</label></dd>
  </dl>
  <dl>
    <dt>备用字段10：</dt>
    <dd><label style="width: 250px;">${(dto.backup10)!}</label></dd>
  </dl>
</div>
<div class="row">
  <div class="col-md-6 col-sm-12">
    <div class="panel" defH="140">
      <h1>多原发</h1>
      <div>
        <table class="table" width="100%">
          <thead>
          <tr>
            <th>原发病种</th>
            <th>部位</th>
            <th>诊断时间</th>
          </tr>
          </thead>
          <tbody>
          <#list multiPrimaryDtoList as dto>
            <tr>
              <td>${dto.primary!}</td>
              <td>${dto.bodypart!}</td>
              <td>${dto.diagnosisDate!}</td>
            </tr>
          </#list>
          </tbody>
        </table>
      </div>
    </div>
  </div>
  <div class="col-md-6 col-sm-12">
    <div class="panel" defH="140">
      <h1>是否接受过治疗</h1>
      <div>
        <table class="table" width="100%">
          <thead>
          <tr>
            <th>治疗类型</th>
            <th>方案</th>
            <th>时间</th>
          </tr>
          </thead>
          <tbody>
          <#list treatHistoryDtoList as dto>
            <tr>
              <td>
                  <#if (dto.treatType)?? && dto.treatType == "immunotherapy">
                    免疫
                  <#elseif (dto.treatType)?? && dto.treatType == "radiation">
                    放射
                  <#elseif (dto.treatType)?? && dto.treatType == "chemotherapy">
                    化疗
                  <#elseif (dto.treatType)?? && dto.treatType == "surgery">
                    手术
                  <#elseif (dto.treatType)?? && dto.treatType == "target">
                    靶向治疗
                  <#elseif (dto.treatType)?? && dto.treatType == "incretion">
                    内分泌治疗
                  </#if>
              </td>
              <td>${dto.plan!}</td>
              <td>${dto.treatDate!}</td>
            </tr>
          </#list>
          </tbody>
        </table>
      </div>
    </div>
  </div>
</div>