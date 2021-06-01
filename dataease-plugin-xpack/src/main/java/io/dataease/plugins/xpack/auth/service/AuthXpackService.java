package io.dataease.plugins.xpack.auth.service;

import io.dataease.plugins.common.service.PluginMenuService;
import io.dataease.plugins.xpack.auth.dto.request.XpackBaseTreeRequest;
import io.dataease.plugins.xpack.auth.dto.request.XpackSysAuthRequest;
import io.dataease.plugins.xpack.auth.dto.response.XpackSysAuthDetail;
import io.dataease.plugins.xpack.auth.dto.response.XpackVAuthModelDTO;
import java.util.List;
import java.util.Map;

public abstract class AuthXpackService extends PluginMenuService {

    public abstract List<XpackVAuthModelDTO> searchAuthModelTree(XpackBaseTreeRequest request, Long userId, Boolean isAdmin);

    public abstract Map<String, List<XpackSysAuthDetail>> searchAuthDetails(XpackSysAuthRequest request);

    public abstract List<XpackSysAuthDetail> searchAuthDetailsModel(String authType);

    public abstract void authChange(XpackSysAuthRequest request, Long userId, String userName, Boolean isAdmin);
}
