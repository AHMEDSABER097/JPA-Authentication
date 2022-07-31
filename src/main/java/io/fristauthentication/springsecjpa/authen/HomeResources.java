package io.fristauthentication.springsecjpa.authen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
class HomeResourcesTest {
    @GetMapping("/")
    public String home()
    {
        return ("<h1> welcome home </h1>");
    }
    @GetMapping("/user")
    public String user()
    {
        return ("<h1> welcome our client </h1>");
    }
    @GetMapping("/admin")
    public String admin()
    {
        return ("<h1> welcome our admin </h1>");
    }
}
