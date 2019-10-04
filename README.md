# vts-spring-config-server-1482
This project was created to demonstrate the problem documented in <https://github.com/spring-cloud/spring-cloud-config/issues/1482>

To see the problem, follow the steps below. It does not give steps for actually checking if something is going through a proxy or not due to the difficulty of explaining that for someone running in a different environment against their own proxy. These instructions will have you set a breakpoint in code and view the underlying issue there. Because of that, you can actually demonstrate the issue without even providing a valid proxy URI as a system property. 


1. Add a breakpoint in HttpClientConfigurableHttpConnectionFactory at the end of the addConfiguration method.
2. Run the class VTSConfigServerApplication in debug mode. You should set the proxyuri property first. As mentioned above, it does not have to be a valid URI. 

Once it stops at the breakpoint, look at the items in the httpClientBuildersByUri map. It contains only one entry in the map for "https://github.com/marnee01/mderider-MultiApps.git", which means that there is only one set of http settings that can possibly be used when accessing that repo, even though the bootstrap is set up with different proxy settings depending on the profile. 