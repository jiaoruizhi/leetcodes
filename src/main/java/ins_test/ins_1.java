package ins_test;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.Version;
import com.restfb.types.Page;
import com.restfb.types.instagram.*;

public class ins_1 {
  public static void main(String[] args) {
    FacebookClient facebookClient = new DefaultFacebookClient("facebook_page_access_token", Version.LATEST);

    Page page = facebookClient.fetchObject("fb_page_name", Page.class,
      Parameter.with("fields", "id, name, username, about, fan_count, engagement, talking_about_count, picture, website, instagram_business_account"));

    IgUser igUser = page.getInstagramBusinessAccount();

    System.out.println(igUser.getUsername());

  }


}




