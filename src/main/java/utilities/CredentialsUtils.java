package utilities;

import io.github.cdimascio.dotenv.Dotenv;

public class CredentialsUtils {
    public static String es_username;
    public static String es_password;

    public static String es_username_concat_with_env;
    public static String es_password_concat_with_env;

    public static String kibana_token;
    public static String kibana_token_concat_with_env;

    public static Dotenv dotenv = Dotenv.load(); //Dotenv is used to utilize environment variables and secure the secrets from exposing

    public static String getElasticSearchUsername(String environment){
        if(!environment.isEmpty()){
            es_username_concat_with_env = "ES_USERNAME_" + environment.toUpperCase();
            es_username = dotenv.get(es_username_concat_with_env);
        }
        else{
            es_username = dotenv.get("ES_USERNAME_DEV");
        }
        return es_username;
    }

    public static String getElasticSearchPassword(String environment){
        if(!environment.isEmpty()){
            es_password_concat_with_env = "ES_PASSWORD_" + environment.toUpperCase();
            es_password = dotenv.get(es_password_concat_with_env);
        }
        else{
            es_password = dotenv.get("ES_PASSWORD_DEV");
        }
        return es_password;
    }

    public static String getKibanaBasicToken(String environment){
        if(!environment.isEmpty()){
            kibana_token_concat_with_env = "KIBANA_TOKEN_" + environment.toUpperCase();
            kibana_token = "Basic " + dotenv.get(kibana_token_concat_with_env);
        }
        else{
            kibana_token = "Basic " + dotenv.get("KIBANA_TOKEN_DEV");
        }
        return kibana_token;
    }
}
