let selectedPatientId;

function viewDetail(patientId) {
    selectedPatientId = patientId;
}

function saveItemCallback(form) {
    let $form = $(form);

    // if (!$form.valid()) {
    //     return false;
    // }
    $.ajax({
        type: form.method || 'POST',
        url:$form.attr("action") + selectedPatientId,
        data:$form.serializeArray(),
        dataType:"json",
        cache: false,
        success: function () {
            divRefresh('bloodTestedForm', 'bloodTestedDiv');
        },
        error: DWZ.ajaxError
    });

    return false;
}

function divRefresh(formId, rel) {
    var $form = $("#" + formId);
    // if ($form[DWZ.pageInfo.pageNum]) $form[DWZ.pageInfo.pageNum].value = 1;
    if (rel) {
        var $box = $("#" + rel);
        $box.ajaxUrl({
            type: "POST",
            url: $form.attr("action") + selectedPatientId,
            data: $form.serializeArray(),
            callback: function () {
                $box.find("[layoutH]").layoutH();
            }
        });
    }
    return false;
}

function deleteItem(id) {
    alertMsg.confirm("确定要删除吗?", {
        okCall: function(){
            $.ajax({
                type: 'POST',
                url: 'bloodtested/del?id=' + id,
                dataType:"json",
                cache: false,
                success: function () {
                    divRefresh('bloodTestedForm', 'bloodTestedDiv');
                },
                error: DWZ.ajaxError
            });
        }
    });
}