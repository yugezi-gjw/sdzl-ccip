
<div class="pageContent">
  <form method="post" action="patient/list" class="pageForm" onsubmit="return navTabSearch(this);">
    <div class="pageFormContent" layoutH="58">
      <div class="unit">
        <label>患者姓名：</label>
        <input type="text" size="25" name="patientName" value="${(patientDto.patientName)!}"/>
        <span class="inputInfo">关键字或全称</span>
      </div>
      <div class="unit">
        <label>患者ID：</label>
        <input type="text" size="25" name="outpatientRoom" value="${(patientDto.outpatientRoom)!}"/>
        <span class="inputInfo">完整的患者号</span>
      </div>
      <div class="unit">
        <label>医   师：</label>
        <select style="margin-right:3px; font-size: 12px; width: 160px; padding: 2px 2px 2px 2px" name="physician" value="${(patientDto.physician)!}">
            <#list physicianList as practitioner>
                <#if patientDto.physician?? && practitioner.practitioner_id == patientDto.physician>
                  <option value="${practitioner.practitioner_id!}" selected>${practitioner.practitioner_name!}</option>
                <#else>
                  <option value="${practitioner.practitioner_id!}">${practitioner.practitioner_name!}</option>
                </#if>
            </#list>
        </select>
      </div>
      <div class="unit">
        <label>诊   室：</label>
        <input type="text" size="25" name="outpatientRoom" value="${(patientDto.outpatientRoom)!}"/>
      </div>
      <div class="unit">
        <label>诊   断：</label>
        <select style="margin-right:3px; font-size: 12px; width: 160px; padding: 2px 2px 2px 2px" name="diagnosis" value="${(patientDto.diagnosis)!}">
            <#list diagnosisList as diagnosis>
                <#if patientDto.diagnosis?? && diagnosis.diagnosis_code == patientDto.diagnosis>
                  <option value="${diagnosis.diagnosis_code!}" selected>${diagnosis.diagnosis_desc!}</option>
                <#else>
                  <option value="${diagnosis.diagnosis_code!}">${diagnosis.diagnosis_desc!}</option>
                </#if>
            </#list>
        </select>
      </div>
      <div class="unit">
        <label>处   方：</label>
        <select style="margin-right:3px; font-size: 12px; width: 160px; padding: 2px 2px 2px 2px" name="prescription" value="${(patientDto.prescription)!}">
            <#list prescriptionList as prescription>
                <#if patientDto.prescription?? && prescription.prescription_code == patientDto.prescription>
                  <option value="${prescription.prescription_code!}" selected>${prescription.prescription_desc!}</option>
                <#else>
                  <option value="${prescription.prescription_code!}">${prescription.prescription_desc!}</option>
                </#if>
            </#list>
        </select>
      </div>
      <div class="unit">
        <label>治疗技术：</label>
        <select style="margin-right:3px; font-size: 12px; width: 160px; padding: 2px 0 2px 0" name="technical" value="${(patientDto.technical)!}">
            <#list technicalList as technical>
                <#if patientDto.technical?? && technical.code == patientDto.technical>
                  <option value="${technical.code!}" selected>${technical.name!}</option>
                <#else>
                  <option value="${technical.code!}">${technical.name!}</option>
                </#if>
            </#list>
        </select>
      </div>
      <div class="unit">
        <label>登记日期：</label>
        <input name="registeredDt" type="text" class="date" value="${(patientDto.registeredDt)!}" />
      </div>
      <div class="unit">
        <label>电   话：</label>
        <input type="text" name="telephone" value="${(patientDto.telephone)!}" />
      </div>
      <div class="unit">
        <label>物 理 师：</label>
        <select style="margin-right:3px; font-size: 12px; width: 160px; padding: 2px 2px 2px 2px" name="physicist" value="${(patientDto.physicist)!}">
            <#list physicistList as practitioner>
                <#if patientDto.physicist?? && practitioner.practitioner_id == patientDto.physicist>
                  <option value="${practitioner.practitioner_id!}" selected>${practitioner.practitioner_name!}</option>
                <#else>
                  <option value="${practitioner.practitioner_id!}">${practitioner.practitioner_name!}</option>
                </#if>
            </#list>
        </select>
      </div>
    </div>
    <div class="formBar">
      <ul>
        <li><div class="buttonActive"><div class="buttonContent"><button type="submit">开始检索</button></div></div></li>
        <li><div class="button"><div class="buttonContent"><button type="reset">清空重输</button></div></div></li>
      </ul>
    </div>
  </form>
</div>
