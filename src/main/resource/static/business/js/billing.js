let selectedPatientId;

function showPatientBilling(patientId) {
    selectedPatientId = patientId;
    $("#submitBtn").removeAttr("disabled");

    divRefresh('billingItemForm', 'billingItemDiv');
}

function saveItemCallback(form) {
    let $form = $(form);

    if (!$form.valid()) {
        return false;
    }
    $.ajax({
        type: form.method || 'POST',
        url:$form.attr("action") + selectedPatientId,
        data:$form.serializeArray(),
        dataType:"json",
        cache: false,
        success: function () {
            divRefresh('billingItemForm', 'billingItemDiv');
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

function queryPatient(form, rel){
    selectedPatientId = '';

    $("#submitBtn").attr("disabled", true);

    let $form = $(form);
    if (form[DWZ.pageInfo.pageNum]) form[DWZ.pageInfo.pageNum].value = 1;
    if (rel) {
        let $box = $("#" + rel);
        $box.ajaxUrl({
            type:"POST", url:$form.attr("action"), data: $form.serializeArray(), callback:function(){
                $box.find("[layoutH]").layoutH();

                divRefresh('billingItemForm', 'billingItemDiv');
            }
        });
    }

    return false;
}

function deleteItem(id) {
    $.ajax({
        type: 'POST',
        url: 'billing/del?id=' + id,
        dataType:"json",
        cache: false,
        success: function () {
            divRefresh('billingItemForm', 'billingItemDiv');
        },
        error: DWZ.ajaxError
    });
}

function save(json) {
    DWZ.ajaxDone(json);
    if (json[DWZ.keys.statusCode] == DWZ.statusCode.ok){
        var $box = $parent.find("#billingItemDiv");
        var form = $("#billingItemForm", $parent);
        if (form) {
            $box.ajaxUrl({
                type:"POST", url:$(form).attr("action"), data: $(form).serializeArray(), callback:function(){
                    $box.find("[layoutH]").layoutH();
                }
            });
        }

        if ("closeCurrent" == json.callbackType) {
            $.pdialog.closeCurrent();
        }
    }
}
