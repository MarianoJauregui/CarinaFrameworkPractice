package com.qaprosoft.carina.demo.api.impl;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

import java.util.Random;

@Endpoint(url = "${base_url}/posts/${id}", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/personalUsers/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class Get extends AbstractApiMethodV2 {

    Random random = new Random();
    public Get() {
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
        replaceUrlPlaceholder("id", String.valueOf(random.nextInt(10)));
    }
}
