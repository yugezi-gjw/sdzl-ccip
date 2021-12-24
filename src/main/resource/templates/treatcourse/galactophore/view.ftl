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