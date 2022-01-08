<div class="pageContent" style="padding:5px">
  <div class="panel" defH="70">
    <h1>病人基本信息</h1>
    <div class="pageContent">
      <div class="pageFormContent" style="padding: 0 60px 0 30px;">
        <p>
          <label>姓    名：</label>
          <label style="font-size: large; font-weight: bold">${(patient.patientName)!}</label>
        </p>
        <p>
          <label>住 院 号：</label>
          <label style="font-size: large; font-weight: bold">${(patient.inpatientId)!}</label>
        </p>
        <p>
          <label>性    别：</label>
          <label>
              <#if patient.gender == "1">
                  男
                  <#else>
                  女
              </#if>
          </label>
        </p>
        <p>
          <label>身 份 证：</label>
          <label>${(patient.nationalId)!}</label>
        </p>
      </div>
    </div>
  </div>
  <div class="divider"></div>
  <div class="tabs">
    <div class="tabsHeader">
      <div class="tabsHeaderContent">
        <ul>
          <li><a href="javascript:;"><span>详细就诊信息</span></a></li>
        </ul>
      </div>
    </div>
    <div class="tabsContent">
      <div>
        <div layoutH="146" style="float:left; display:block; overflow:auto; width:240px; border:solid 1px #CCC; line-height:21px; background:#fff">
          <ul class="tree treeFolder">
            <li><a href="javascript">病种</a>
              <ul>
                  <#list list as treatcourse>
                  <li><a href="treatcourse/bodypart?treatCourseId=${(treatcourse.treatCourseId)!}" target="ajax" rel="treatcourseBox">${(treatcourse.bodypart)!}</a></li>
                  </#list>
              </ul>
            </li>

          </ul>
        </div>

        <div id="treatcourseBox" class="unitBox" style="margin-left:246px;">
        </div>

      </div>
    </div>
    <div class="tabsFooter">
      <div class="tabsFooterContent"></div>
    </div>
  </div>

</div>




