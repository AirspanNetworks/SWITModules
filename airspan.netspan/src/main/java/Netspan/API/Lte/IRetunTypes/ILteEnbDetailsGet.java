package Netspan.API.Lte.IRetunTypes;

public interface ILteEnbDetailsGet {
	/**
     * Gets the value of the sonProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSonProfile();

    /**
     * Sets the value of the sonProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSonProfile(String value);
    public void setNetworkProfile(String value);
    public String getNetworkProfile();
    public void setSecurityProfile(String value);
    public String getSecurityProfile();
}
