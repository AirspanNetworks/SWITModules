package Netspan.NBI_15_1.Server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.1
 * 2016-12-06T19:17:59.097+02:00
 * Generated source version: 3.0.1
 * 
 */
@WebService(targetNamespace = "http://Airspan.Netspan.WebServices", name = "ServerSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface ServerSoap {

    /**
     * Create a CTS.
     */
    @WebMethod(operationName = "CtsCreate", action = "http://Airspan.Netspan.WebServices/CtsCreate")
    @RequestWrapper(localName = "CtsCreate", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_1.Server.CtsCreate")
    @ResponseWrapper(localName = "CtsCreateResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_1.Server.CtsCreateResponse")
    @WebResult(name = "CtsCreateResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_1.Server.CtsResponse ctsCreate(
        @WebParam(name = "Cts", targetNamespace = "http://Airspan.Netspan.WebServices")
        Netspan.NBI_15_1.Server.CtsSetWs cts,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Get a CTS.
     */
    @WebMethod(operationName = "CtsGet", action = "http://Airspan.Netspan.WebServices/CtsGet")
    @RequestWrapper(localName = "CtsGet", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_1.Server.CtsGet")
    @ResponseWrapper(localName = "CtsGetResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_1.Server.CtsGetResponse")
    @WebResult(name = "CtsGetResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_1.Server.CtsGetResult ctsGet(
        @WebParam(name = "Name", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.util.List<java.lang.String> name,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Returns a list of NMS Users.  Requires NBIF Extensions Licence.
     */
    @WebMethod(operationName = "NmsUserList", action = "http://Airspan.Netspan.WebServices/NmsUserList")
    @RequestWrapper(localName = "NmsUserList", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_1.Server.NmsUserList")
    @ResponseWrapper(localName = "NmsUserListResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_1.Server.NmsUserListResponse")
    @WebResult(name = "NmsUserListResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_1.Server.NameResult nmsUserList(
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Clone a CTS.
     */
    @WebMethod(operationName = "CtsClone", action = "http://Airspan.Netspan.WebServices/CtsClone")
    @RequestWrapper(localName = "CtsClone", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_1.Server.CtsClone")
    @ResponseWrapper(localName = "CtsCloneResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_1.Server.CtsCloneResponse")
    @WebResult(name = "CtsCloneResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_1.Server.CtsResponse ctsClone(
        @WebParam(name = "CloneFromName", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.lang.String cloneFromName,
        @WebParam(name = "Cts", targetNamespace = "http://Airspan.Netspan.WebServices")
        Netspan.NBI_15_1.Server.CtsSetWs cts,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Delete one or more NMS Users.  Requires NBIF Extensions Licence.
     */
    @WebMethod(operationName = "NmsUserDelete", action = "http://Airspan.Netspan.WebServices/NmsUserDelete")
    @RequestWrapper(localName = "NmsUserDelete", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_1.Server.NmsUserDelete")
    @ResponseWrapper(localName = "NmsUserDeleteResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_1.Server.NmsUserDeleteResponse")
    @WebResult(name = "NmsUserDeleteResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_1.Server.UserResponse nmsUserDelete(
        @WebParam(name = "UserName", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.util.List<java.lang.String> userName,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Returns NMS info.  Requires NBIF Extensions Licence.
     */
    @WebMethod(operationName = "NmsInfoGet", action = "http://Airspan.Netspan.WebServices/NmsInfoGet")
    @RequestWrapper(localName = "NmsInfoGet", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_1.Server.NmsInfoGet")
    @ResponseWrapper(localName = "NmsInfoGetResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_1.Server.NmsInfoGetResponse")
    @WebResult(name = "NmsInfoGetResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_1.Server.NmsInfoResponse nmsInfoGet(
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Delete one or more CTS's.
     */
    @WebMethod(operationName = "CtsDelete", action = "http://Airspan.Netspan.WebServices/CtsDelete")
    @RequestWrapper(localName = "CtsDelete", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_1.Server.CtsDelete")
    @ResponseWrapper(localName = "CtsDeleteResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_1.Server.CtsDeleteResponse")
    @WebResult(name = "CtsDeleteResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_1.Server.CtsResponse ctsDelete(
        @WebParam(name = "Name", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.util.List<java.lang.String> name,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Update a NMS User from the NMS. Requires NBIF Extensions Licence.
     */
    @WebMethod(operationName = "NmsUserUpdate", action = "http://Airspan.Netspan.WebServices/NmsUserUpdate")
    @RequestWrapper(localName = "NmsUserUpdate", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_1.Server.NmsUserUpdate")
    @ResponseWrapper(localName = "NmsUserUpdateResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_1.Server.NmsUserUpdateResponse")
    @WebResult(name = "NmsUserUpdateResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_1.Server.UserResponse nmsUserUpdate(
        @WebParam(name = "UserName", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.lang.String userName,
        @WebParam(name = "NmsUser", targetNamespace = "http://Airspan.Netspan.WebServices")
        Netspan.NBI_15_1.Server.NmsUserSetWs nmsUser,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Get a NMS User from the NMS. Requires NBIF Extensions Licence.
     */
    @WebMethod(operationName = "NmsUserGet", action = "http://Airspan.Netspan.WebServices/NmsUserGet")
    @RequestWrapper(localName = "NmsUserGet", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_1.Server.NmsUserGet")
    @ResponseWrapper(localName = "NmsUserGetResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_1.Server.NmsUserGetResponse")
    @WebResult(name = "NmsUserGetResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_1.Server.NmsUserGetResult nmsUserGet(
        @WebParam(name = "UserName", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.util.List<java.lang.String> userName,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Create a NMS User on the NMS. Requires NBIF Extensions Licence.
     */
    @WebMethod(operationName = "NmsUserCreate", action = "http://Airspan.Netspan.WebServices/NmsUserCreate")
    @RequestWrapper(localName = "NmsUserCreate", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_1.Server.NmsUserCreate")
    @ResponseWrapper(localName = "NmsUserCreateResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_1.Server.NmsUserCreateResponse")
    @WebResult(name = "NmsUserCreateResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_1.Server.UserResponse nmsUserCreate(
        @WebParam(name = "NmsUser", targetNamespace = "http://Airspan.Netspan.WebServices")
        Netspan.NBI_15_1.Server.NmsUserSetWs nmsUser,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Update a CTS.
     */
    @WebMethod(operationName = "CtsUpdate", action = "http://Airspan.Netspan.WebServices/CtsUpdate")
    @RequestWrapper(localName = "CtsUpdate", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_1.Server.CtsUpdate")
    @ResponseWrapper(localName = "CtsUpdateResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_1.Server.CtsUpdateResponse")
    @WebResult(name = "CtsUpdateResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_1.Server.CtsResponse ctsUpdate(
        @WebParam(name = "Name", targetNamespace = "http://Airspan.Netspan.WebServices")
        java.lang.String name,
        @WebParam(name = "Cts", targetNamespace = "http://Airspan.Netspan.WebServices")
        Netspan.NBI_15_1.Server.CtsSetWs cts,
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );

    /**
     * Returns a list of CTS.
     */
    @WebMethod(operationName = "CtsList", action = "http://Airspan.Netspan.WebServices/CtsList")
    @RequestWrapper(localName = "CtsList", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_1.Server.CtsList")
    @ResponseWrapper(localName = "CtsListResponse", targetNamespace = "http://Airspan.Netspan.WebServices", className = "Netspan.NBI_15_1.Server.CtsListResponse")
    @WebResult(name = "CtsListResult", targetNamespace = "http://Airspan.Netspan.WebServices")
    public Netspan.NBI_15_1.Server.NameResult ctsList(
        @WebParam(name = "Credentials", targetNamespace = "http://Airspan.Netspan.WebServices", header = true)
        Credentials credentials
    );
}
