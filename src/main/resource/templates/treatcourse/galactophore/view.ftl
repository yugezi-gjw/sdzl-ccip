<div class="pageFormContent">
  <dl>
    <dt>初潮年龄：</dt>
    <dd><label>${(dto.menarcheAge)!}</label></dd>
  </dl>
  <dl>
    <dt>闭经年龄：</dt>
    <dd><label>${(dto.amenorrheaAge)!}</label></dd>
  </dl>
  <dl>
    <dt>分子分型：</dt>
    <dd><label>${(dto.molecularSubtyping)!}</label></dd>
  </dl>
  <dl>
    <dt>ER：</dt>
    <dd><label>${(dto.er)!}</label></dd>
  </dl>
  <dl>
    <dt>PR：</dt>
    <dd><label>${(dto.pr)!}</label></dd>
  </dl>
  <dl>
    <dt>Her-2：</dt>
    <dd><label>${(dto.her2)!}</label></dd>
  </dl>
  <dl>
    <dt>Ki-67：</dt>
    <dd><label>${(dto.ki67)!}</label></dd>
  </dl>
  <dl>
    <dt>分期：</dt>
    <dd><label>${(dto.stage)!}</label></dd>
  </dl>
  <dl>
    <dt>分期TNM：</dt>
    <dd><label>${(dto.stageTNM)!}</label></dd>
  </dl>
  <dl>
    <dt>手术方式：</dt>
    <dd><label>${(dto.surgeryMode)!}</label></dd>
  </dl>
  <dl>
    <dt>FISH扩增：</dt>
    <dd><label>${(dto.fishAugmentation)!}</label></dd>
  </dl>
  <dl>
    <dt>基因检测：</dt>
    <dd><label>${(dto.geneticTest)!}</label></dd>
  </dl>
  <dl>
    <dt>STEEP评分：</dt>
    <dd><label>${(dto.steepGrade)!}</label></dd>
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
    <dt>首次进展时间：</dt>
    <dd><label>${(dto.progressDt)!}</label></dd>
  </dl>
  <dl>
    <dt>放疗次数：</dt>
    <dd><label>${(dto.deliveredFraction)!}</label></dd>
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
                <#elseif dto.alive == "0">
                  否
                </#if>
            </#if>
      </label></dd>
  </dl>
  <dl>
    <dt>有无胸壁/乳腺放疗：</dt>
    <dd><label>
            <#if (dto.isGalactophoreRadiation)??>
                <#if dto.isGalactophoreRadiation == "1">
                  有
                <#elseif dto.isGalactophoreRadiation == "0">
                  无
                </#if>
            </#if>
      </label></dd>
  </dl>
  <dl>
    <dt>胸壁放疗时间、范围及剂量：</dt>
    <dd><label style="width: 250px;">${(dto.galactophoreRadiation)!}</label></dd>
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
    <dt>有无肝转移：</dt>
    <dd><label>
            <#if (dto.isHepaticMetastases)??>
                <#if dto.isHepaticMetastases == "1">
                  有
                <#elseif dto.isHepaticMetastases == "0">
                  无
                </#if>
            </#if>
      </label></dd>
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
    <dt>是否用抗Her-2药物：</dt>
    <dd><label>
            <#if (dto.her2Drug)??>
                <#if dto.her2Drug == "1">
                  是
                <#elseif dto.her2Drug == "0">
                  否
                </#if>
            </#if>
      </label></dd>
  </dl>
  <dl>
    <dt>是否用内分泌：</dt>
    <dd><label>
            <#if (dto.incretion)??>
                <#if dto.incretion == "1">
                  是
                <#elseif dto.incretion == "0">
                  否
                </#if>
            </#if>
      </label></dd>
  </dl>
  <dl>
    <dt>是否用免疫：</dt>
    <dd><label>
            <#if (dto.immunized)??>
                <#if dto.immunized == "1">
                  是
                <#elseif dto.immunized == "0">
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