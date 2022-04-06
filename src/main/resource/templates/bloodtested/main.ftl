<div>
  <form class="required-validate" onsubmit="return saveBloodTestedCallback(this)" action="bloodtested/save?treatCourseId=${treatCourseId!}" method="post">
    <div class="pageFormContent">
      <p>
        <label>检测时间：</label>
        <input name="testedName" type="text"/>
      </p>
      <p>
        <label>白 细 胞：</label>
        <input name="whiteCells" type="text"/>
      </p>
      <p>
        <label>中性粒细胞：</label>
        <input name="neutrophilLeucocyte" type="text"/>
      </p>
      <p>
        <label>淋巴细胞：</label>
        <input name="lymphocyte" type="text"/>
      </p>
      <p>
        <label>单核细胞：</label>
        <input name="monocyte" type="text"/>
      </p>
      <p>
        <label>血 小 板：</label>
        <input name="thrombocyte" type="text"/>
      </p>
      <p>
        <label>SII：</label>
        <input name="sii" type="text"/>
      </p>
      <p>
        <label>NLR：</label>
        <input name="nlr" type="text"/>
      </p>
      <p>
        <label>PLR：</label>
        <input name="plr" type="text"/>
      </p>
      <p>
        <label>LMR：</label>
        <input name="lmr" type="text"/>
      </p>
      <p>
        <label>备注：</label>
        <input name="comment" type="text"/>
      </p>
    </div>
    <div class="pageHeader">
      <div class="searchBar">
        <div class="subBar">
          <ul>
            <li>
                <#--                      <@shiro.hasPermission name="billing:add">-->
              <div class="buttonActive">
                <div class="buttonContent">
                  <button id="submitBtn" type="submit">保 存</button>
                </div>
              </div>
                <#--                      </@shiro.hasPermission>-->
            </li>
          </ul>
        </div>
      </div>
    </div>
  </form>

  <form id="bloodTestedForm"
        action="bloodtested/list?treatCourseId=${treatCourseId!}" method="post">
      <#--      <input type="hidden" name="pageNum" value="${((page.pageIndex)!0)}"/>-->
      <#--      <input type="hidden" name="numPerPage" value="${(page.pageSize)!}"/>-->
  </form>

    <#--        <div class="panelBar">-->
    <#--          <ul class="toolBar">-->
    <#--              <@shiro.hasPermission name="patient:add">-->
    <#--                <li><a class="add" href="bloodtested/add?dtoId=${(dto.id)!}" target="dialog" rel="save"><span>添加</span></a></li>-->
    <#--              </@shiro.hasPermission>-->
    <#--              <@shiro.hasPermission name="patient:del">-->
    <#--                <li><a class="delete" href="bloodtested/del?id={sid}" target="ajaxTodo" title="确定要删除吗?"><span>删除</span></a></li>-->
    <#--              </@shiro.hasPermission>-->
    <#--          </ul>-->
    <#--        </div>-->
  <div id="bloodTestedDiv" class="pageContent">
    <table class="table" width="100%" layoutH="158" addButton="新建">
      <thead>
      <tr>
          <#--              <th orderField="id"  >ID</th>-->
        <th>检测时间</th>
        <th>白细胞</th>
        <th>中性粒细胞</th>
        <th>淋巴细胞</th>
        <th>单核细胞</th>
        <th>血小板</th>
        <th>SII</th>
        <th>NLR</th>
        <th>PLR</th>
        <th>LMR</th>
        <th>备注</th>
        <th>操作</th>
      </tr>
      </thead>
      <tbody>
      <#if list?? && (list?size > 0)>
          <#list list as bloodTested>
            <tr>
          <#--                        <td>${bloodTested.id!}</td>-->
            <td>${bloodTested.testedName!}</td>
            <td>${bloodTested.whiteCells!}</td>
            <td>${bloodTested.neutrophilLeucocyte!}</td>
            <td>${bloodTested.lymphocyte!}</td>
            <td>${bloodTested.monocyte!}</td>
            <td>${bloodTested.thrombocyte!}</td>
            <td>${bloodTested.sii!}</td>
            <td>${bloodTested.nlr!}</td>
            <td>${bloodTested.plr!}</td>
            <td>${bloodTested.lmr!}</td>
            <td>${bloodTested.comment!}</td>
            <td>
              <a class="delete" onclick="deleteBloodTested('${bloodTested.id}');" title="确定要删除吗?"><span>删除</span></a>
            </td>
            </tr>
          </#list>
      </#if>
      </tbody>
    </table>
  </div>
</div>