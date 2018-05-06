package Netspan.NBI_15_5.Server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.1
 * 2017-10-09T13:31:26.969+03:00
 * Generated source version: 3.0.1
 * 
 */
@WebService(targetNamespace = "http://Airspan.Netspan.WebServices", name = "ServerSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface ServerSoap {

    /**
     * Returns a list of NMS Licenses.  Requires NBIF Extensions Licence.
     */
    @WebMethod(operationName = "NmsLicenseList", action = "http://Airspan.Netspan.WebServices/NmsLicenseList")
    @RequestWrapper(localName = "NmsLicenseList", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.NmsLicenseList")
    @ResponseWrapper(localName = "NmsLicenseListResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.NmsLicenseListResponse")
    @WebResult(name = "NmsLicenseListResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_5.Server.NmsLicenseListResult nmsLicenseList(
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Create a CTS.
     */
    @WebMethod(operationName = "CtsCreate", action = "http://Airspan.Netspan.WebServices/CtsCreate")
    @RequestWrapper(localName = "CtsCreate", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.CtsCreate")
    @ResponseWrapper(localName = "CtsCreateResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.CtsCreateResponse")
    @WebResult(name = "CtsCreateResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_5.Server.CtsResponse ctsCreate(
        @WebParam(name = "Cts", targetNamespace = "http://Airspan.Netspan.WebServices")
        Netspan.NBI_15_5.Server.CtsSetWs cts,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Returns a list of NMS License summary. Requires NBIF Extensions Licence
     */
    @WebMethod(operationName = "NmsLicenseSummaryList", action = "http://Airspan.Netspan.WebServices/NmsLicenseSummaryList")
    @RequestWrapper(localName = "NmsLicenseSummaryList", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.NmsLicenseSummaryList")
    @ResponseWrapper(localName = "NmsLicenseSummaryListResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.NmsLicenseSummaryListResponse")
    @WebResult(name = "NmsLicenseSummaryListResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_5.Server.NmsLicenseSummaryListResult nmsLicenseSummaryList(
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Returns a list of NMS Users.  Requires NBIF Extensions Licence.
     */
    @WebMethod(operationName = "NmsUserList", action = "http://Airspan.Netspan.WebServices/NmsUserList")
    @RequestWrapper(localName = "NmsUserList", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.NmsUserList")
    @ResponseWrapper(localName = "NmsUserListResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.NmsUserListResponse")
    @WebResult(name = "NmsUserListResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_5.Server.NameResult nmsUserList(
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Sets the Node File Upload Details. Requires NBIF Extensions Licence.
     */
    @WebMethod(operationName = "NodeFileUploadConfigSet", action = "http://Airspan.Netspan.WebServices/NodeFileUploadConfigSet")
    @RequestWrapper(localName = "NodeFileUploadConfigSet", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.NodeFileUploadConfigSet")
    @ResponseWrapper(localName = "NodeFileUploadConfigSetResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.NodeFileUploadConfigSetResponse")
    @WebResult(name = "NodeFileUploadConfigSetResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_5.Server.WsResponse nodeFileUploadConfigSet(
        @WebParam(name = "NodeFileUpload", targetNamespace = "http://Airspan.Netspan.WebServices")
        Netspan.NBI_15_5.Server.NodeFileUpload nodeFileUpload,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Returns a list of File Servers. Requires NBIF Extensions Licence.
     */
    @WebMethod(operationName = "FileServerList", action = "http://Airspan.Netspan.WebServices/FileServerList")
    @RequestWrapper(localName = "FileServerList", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.FileServerList")
    @ResponseWrapper(localName = "FileServerListResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.FileServerListResponse")
    @WebResult(name = "FileServerListResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_5.Server.NameResult fileServerList(
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Delete one or more NMS Users.  Requires NBIF Extensions Licence.
     */
    @WebMethod(operationName = "NmsUserDelete", action = "http://Airspan.Netspan.WebServices/NmsUserDelete")
    @RequestWrapper(localName = "NmsUserDelete", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.NmsUserDelete")
    @ResponseWrapper(localName = "NmsUserDeleteResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.NmsUserDeleteResponse")
    @WebResult(name = "NmsUserDeleteResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_5.Server.UserResponse nmsUserDelete(
        @WebParam(name = "UserName", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.util.List<java.lang.String> userName,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Returns NMS info.  Requires NBIF Extensions Licence.
     */
    @WebMethod(operationName = "NmsInfoGet", action = "http://Airspan.Netspan.WebServices/NmsInfoGet")
    @RequestWrapper(localName = "NmsInfoGet", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.NmsInfoGet")
    @ResponseWrapper(localName = "NmsInfoGetResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.NmsInfoGetResponse")
    @WebResult(name = "NmsInfoGetResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_5.Server.NmsInfoResponse nmsInfoGet(
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Delete one or more CTS's.
     */
    @WebMethod(operationName = "CtsDelete", action = "http://Airspan.Netspan.WebServices/CtsDelete")
    @RequestWrapper(localName = "CtsDelete", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.CtsDelete")
    @ResponseWrapper(localName = "CtsDeleteResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.CtsDeleteResponse")
    @WebResult(name = "CtsDeleteResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_5.Server.CtsResponse ctsDelete(
        @WebParam(name = "Name", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.util.List<java.lang.String> name,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Update a NMS User from the NMS. Requires NBIF Extensions Licence.
     */
    @WebMethod(operationName = "NmsUserUpdate", action = "http://Airspan.Netspan.WebServices/NmsUserUpdate")
    @RequestWrapper(localName = "NmsUserUpdate", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.NmsUserUpdate")
    @ResponseWrapper(localName = "NmsUserUpdateResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.NmsUserUpdateResponse")
    @WebResult(name = "NmsUserUpdateResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_5.Server.UserResponse nmsUserUpdate(
        @WebParam(name = "UserName", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.lang.String userName,
        @WebParam(name = "NmsUser", targetNamespace = "http://Airspan.Netspan.WebServices")
        Netspan.NBI_15_5.Server.NmsUserSetWs nmsUser,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Clone a File Server. Requires NBIF Extensions Licence.
     */
    @WebMethod(operationName = "FileServerClone", action = "http://Airspan.Netspan.WebServices/FileServerClone")
    @RequestWrapper(localName = "FileServerClone", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.FileServerClone")
    @ResponseWrapper(localName = "FileServerCloneResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.FileServerCloneResponse")
    @WebResult(name = "FileServerCloneResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_5.Server.FileServerResponse fileServerClone(
        @WebParam(name = "CloneFromName", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.lang.String cloneFromName,
        @WebParam(name = "FileServer", targetNamespace = "http://Airspan.Netspan.WebServices")
        Netspan.NBI_15_5.Server.FileServerWs fileServer,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Get a NMS User from the NMS. Requires NBIF Extensions Licence.
     */
    @WebMethod(operationName = "NmsUserGet", action = "http://Airspan.Netspan.WebServices/NmsUserGet")
    @RequestWrapper(localName = "NmsUserGet", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.NmsUserGet")
    @ResponseWrapper(localName = "NmsUserGetResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.NmsUserGetResponse")
    @WebResult(name = "NmsUserGetResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_5.Server.NmsUserGetResult nmsUserGet(
        @WebParam(name = "UserName", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.util.List<java.lang.String> userName,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Create a NMS User on the NMS. Requires NBIF Extensions Licence.
     */
    @WebMethod(operationName = "NmsUserCreate", action = "http://Airspan.Netspan.WebServices/NmsUserCreate")
    @RequestWrapper(localName = "NmsUserCreate", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.NmsUserCreate")
    @ResponseWrapper(localName = "NmsUserCreateResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.NmsUserCreateResponse")
    @WebResult(name = "NmsUserCreateResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_5.Server.UserResponse nmsUserCreate(
        @WebParam(name = "NmsUser", targetNamespace = "http://Airspan.Netspan.WebServices")
        Netspan.NBI_15_5.Server.NmsUserSetWs nmsUser,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Update a CTS.
     */
    @WebMethod(operationName = "CtsUpdate", action = "http://Airspan.Netspan.WebServices/CtsUpdate")
    @RequestWrapper(localName = "CtsUpdate", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.CtsUpdate")
    @ResponseWrapper(localName = "CtsUpdateResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.CtsUpdateResponse")
    @WebResult(name = "CtsUpdateResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_5.Server.CtsResponse ctsUpdate(
        @WebParam(name = "Name", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.lang.String name,
        @WebParam(name = "Cts", targetNamespace = "http://Airspan.Netspan.WebServices")
        Netspan.NBI_15_5.Server.CtsSetWs cts,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Returns a list of CTS.
     */
    @WebMethod(operationName = "CtsList", action = "http://Airspan.Netspan.WebServices/CtsList")
    @RequestWrapper(localName = "CtsList", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.CtsList")
    @ResponseWrapper(localName = "CtsListResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.CtsListResponse")
    @WebResult(name = "CtsListResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_5.Server.NameResult ctsList(
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Update a File Server. Requires NBIF Extensions Licence.
     */
    @WebMethod(operationName = "FileServerUpdate", action = "http://Airspan.Netspan.WebServices/FileServerUpdate")
    @RequestWrapper(localName = "FileServerUpdate", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.FileServerUpdate")
    @ResponseWrapper(localName = "FileServerUpdateResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.FileServerUpdateResponse")
    @WebResult(name = "FileServerUpdateResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_5.Server.FileServerResponse fileServerUpdate(
        @WebParam(name = "Name", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.lang.String name,
        @WebParam(name = "FileServer", targetNamespace = "http://Airspan.Netspan.WebServices")
        Netspan.NBI_15_5.Server.FileServerWs fileServer,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Returns a list of NMS License node summary. Requires NBIF Extension Licence
     */
    @WebMethod(operationName = "NmsLicenseNodeSummaryList", action = "http://Airspan.Netspan.WebServices/NmsLicenseNodeSummaryList")
    @RequestWrapper(localName = "NmsLicenseNodeSummaryList", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.NmsLicenseNodeSummaryList")
    @ResponseWrapper(localName = "NmsLicenseNodeSummaryListResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.NmsLicenseNodeSummaryListResponse")
    @WebResult(name = "NmsLicenseNodeSummaryListResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_5.Server.LicenseNodeSummaryListResult nmsLicenseNodeSummaryList(
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Delete one or more File Servers. Requires NBIF Extensions Licence.
     */
    @WebMethod(operationName = "FileServerDelete", action = "http://Airspan.Netspan.WebServices/FileServerDelete")
    @RequestWrapper(localName = "FileServerDelete", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.FileServerDelete")
    @ResponseWrapper(localName = "FileServerDeleteResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.FileServerDeleteResponse")
    @WebResult(name = "FileServerDeleteResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_5.Server.FileServerResponse fileServerDelete(
        @WebParam(name = "Name", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.util.List<java.lang.String> name,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Returns a list of NMS Server IP addresses.  Requires NBIF Extensions Licence.
     */
    @WebMethod(operationName = "NmsServerIPAddressList", action = "http://Airspan.Netspan.WebServices/NmsServerIPAddressList")
    @RequestWrapper(localName = "NmsServerIPAddressList", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.NmsServerIPAddressList")
    @ResponseWrapper(localName = "NmsServerIPAddressListResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.NmsServerIPAddressListResponse")
    @WebResult(name = "NmsServerIPAddressListResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_5.Server.NmsServerIPAddressListWs nmsServerIPAddressList(
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Get a CTS.
     */
    @WebMethod(operationName = "CtsGet", action = "http://Airspan.Netspan.WebServices/CtsGet")
    @RequestWrapper(localName = "CtsGet", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.CtsGet")
    @ResponseWrapper(localName = "CtsGetResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.CtsGetResponse")
    @WebResult(name = "CtsGetResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_5.Server.CtsGetResult ctsGet(
        @WebParam(name = "Name", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.util.List<java.lang.String> name,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Clone a CTS.
     */
    @WebMethod(operationName = "CtsClone", action = "http://Airspan.Netspan.WebServices/CtsClone")
    @RequestWrapper(localName = "CtsClone", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.CtsClone")
    @ResponseWrapper(localName = "CtsCloneResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.CtsCloneResponse")
    @WebResult(name = "CtsCloneResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_5.Server.CtsResponse ctsClone(
        @WebParam(name = "CloneFromName", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.lang.String cloneFromName,
        @WebParam(name = "Cts", targetNamespace = "http://Airspan.Netspan.WebServices")
        Netspan.NBI_15_5.Server.CtsSetWs cts,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Delete one or more NMS Licences.
     */
    @WebMethod(operationName = "NmsLicenceDelete", action = "http://Airspan.Netspan.WebServices/NmsLicenceDelete")
    @RequestWrapper(localName = "NmsLicenceDelete", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.NmsLicenceDelete")
    @ResponseWrapper(localName = "NmsLicenceDeleteResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.NmsLicenceDeleteResponse")
    @WebResult(name = "NmsLicenceDeleteResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_5.Server.ItemActionResult nmsLicenceDelete(
        @WebParam(name = "LicenceId", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.util.List<java.lang.String> licenceId,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Sets the current NMS Server IPAddress to be used by Nodes. Requires NBIF Extensions Licence.
     */
    @WebMethod(operationName = "NmsServerIPAddressSet", action = "http://Airspan.Netspan.WebServices/NmsServerIPAddressSet")
    @RequestWrapper(localName = "NmsServerIPAddressSet", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.NmsServerIPAddressSet")
    @ResponseWrapper(localName = "NmsServerIPAddressSetResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.NmsServerIPAddressSetResponse")
    @WebResult(name = "NmsServerIPAddressSetResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_5.Server.WsResponse nmsServerIPAddressSet(
        @WebParam(name = "IPAddress", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.lang.String ipAddress,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Get a File Server. Requires NBIF Extensions Licence.
     */
    @WebMethod(operationName = "FileServerGet", action = "http://Airspan.Netspan.WebServices/FileServerGet")
    @RequestWrapper(localName = "FileServerGet", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.FileServerGet")
    @ResponseWrapper(localName = "FileServerGetResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.FileServerGetResponse")
    @WebResult(name = "FileServerGetResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_5.Server.FileServerResponse fileServerGet(
        @WebParam(name = "Name", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.util.List<java.lang.String> name,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Create a File Server. Requires NBIF Extensions Licence.
     */
    @WebMethod(operationName = "FileServerCreate", action = "http://Airspan.Netspan.WebServices/FileServerCreate")
    @RequestWrapper(localName = "FileServerCreate", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.FileServerCreate")
    @ResponseWrapper(localName = "FileServerCreateResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.FileServerCreateResponse")
    @WebResult(name = "FileServerCreateResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_5.Server.FileServerResponse fileServerCreate(
        @WebParam(name = "FileServer", targetNamespace = "http://Airspan.Netspan.WebServices")
        Netspan.NBI_15_5.Server.FileServerWs fileServer,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Returns client request info.  Requires NBIF Extensions Licence.
     */
    @WebMethod(operationName = "ClientRequestInfoGet", action = "http://Airspan.Netspan.WebServices/ClientRequestInfoGet")
    @RequestWrapper(localName = "ClientRequestInfoGet", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.ClientRequestInfoGet")
    @ResponseWrapper(localName = "ClientRequestInfoGetResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.ClientRequestInfoGetResponse")
    @WebResult(name = "ClientRequestInfoGetResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_5.Server.ClientRequestInfoResponse clientRequestInfoGet(
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Add an NMS Licence.
     */
    @WebMethod(operationName = "NmsLicenceAdd", action = "http://Airspan.Netspan.WebServices/NmsLicenceAdd")
    @RequestWrapper(localName = "NmsLicenceAdd", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.NmsLicenceAdd")
    @ResponseWrapper(localName = "NmsLicenceAddResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.NmsLicenceAddResponse")
    @WebResult(name = "NmsLicenceAddResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_5.Server.WsResponse nmsLicenceAdd(
        @WebParam(name = "LicenceBase64", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.lang.String licenceBase64,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Returns the current NMS Server IPAddress for a given type
     */
    @WebMethod(operationName = "NmsServerIPAddressGet", action = "http://Airspan.Netspan.WebServices/NmsServerIPAddressGet")
    @RequestWrapper(localName = "NmsServerIPAddressGet", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.NmsServerIPAddressGet")
    @ResponseWrapper(localName = "NmsServerIPAddressGetResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.NmsServerIPAddressGetResponse")
    @WebResult(name = "NmsServerIPAddressGetResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_5.Server.NmsServerIPAddressGetWs nmsServerIPAddressGet(
        @WebParam(name = "IPAddressType", targetNamespace = "http://Airspan.Netspan.WebServices")
        Netspan.NBI_15_5.Server.IPAddressTypes ipAddressType,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Gets the Node File Upload Details. Requires NBIF Extensions Licence.
     */
    @WebMethod(operationName = "NodeFileUploadConfigGet", action = "http://Airspan.Netspan.WebServices/NodeFileUploadConfigGet")
    @RequestWrapper(localName = "NodeFileUploadConfigGet", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.NodeFileUploadConfigGet")
    @ResponseWrapper(localName = "NodeFileUploadConfigGetResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_5.Server.NodeFileUploadConfigGetResponse")
    @WebResult(name = "NodeFileUploadConfigGetResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_5.Server.NodeFileUploadGetWs nodeFileUploadConfigGet(
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );
}
