package utilities;

import java.util.ResourceBundle;

public class EnvironmentUtils {
    public static String base_url;
    public static String elastic_search_base_url;
    public static String kibana_base_url;

    // method created for getting URL's from properties file
    static ResourceBundle getEndPoints()
    {
        return CustomUtils.getPropertiesFromPropertyFile("base_urls");
    }

    public static String getBaseURL(String environment){
        if(environment.equalsIgnoreCase("dev")){
            base_url = getEndPoints().getString("api_base_url_dev");
        }
        if(environment.equalsIgnoreCase("qa")){
            base_url = getEndPoints().getString("api_base_url_qa");
        }
        if(environment.equalsIgnoreCase("uat")){
            base_url = getEndPoints().getString("api_base_url_uat");
        }
        if(environment.equalsIgnoreCase("prod")){
            base_url = getEndPoints().getString("api_base_url_prod");
        }
        else{
            base_url = getEndPoints().getString("api_base_url_dev");
        }
        return base_url;
    }

    public static String getESBaseURL(String environment){
        if(environment.equalsIgnoreCase("dev")){
            elastic_search_base_url = getEndPoints().getString("elastic_search_base_url_dev");
        }
        if(environment.equalsIgnoreCase("qa")){
            elastic_search_base_url = getEndPoints().getString("elastic_search_base_url_qa");
        }
        if(environment.equalsIgnoreCase("uat")){
            elastic_search_base_url = getEndPoints().getString("elastic_search_base_url_uat");
        }
        if(environment.equalsIgnoreCase("prod")){
            elastic_search_base_url = getEndPoints().getString("elastic_search_base_url_prod");
        }
        else{
            elastic_search_base_url = getEndPoints().getString("elastic_search_base_url_dev");
        }
        return elastic_search_base_url;
    }

    public static String getKibanaBaseURL(String environment){
        if(environment.equalsIgnoreCase("dev")){
            kibana_base_url = getEndPoints().getString("kibana_base_url_dev");
        }
        if(environment.equalsIgnoreCase("qa")){
            kibana_base_url = getEndPoints().getString("kibana_base_url_qa");
        }
        if(environment.equalsIgnoreCase("uat")){
            kibana_base_url = getEndPoints().getString("kibana_base_url_uat");
        }
        if(environment.equalsIgnoreCase("prod")){
            kibana_base_url = getEndPoints().getString("kibana_base_url_prod");
        }
        else{
            kibana_base_url = getEndPoints().getString("kibana_base_url_dev");
        }
        return kibana_base_url;
    }
}
