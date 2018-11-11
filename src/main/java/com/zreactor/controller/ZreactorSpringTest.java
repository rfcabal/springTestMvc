package com.zreactor.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.util.rest.RestClient;
import com.util.rest.models.ResponseTest;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.logging.Logger;

@Controller
public class ZreactorSpringTest {

    final static Logger LOGGER = Logger.getLogger("InfoLogging");

    @RequestMapping("/")
    public ModelAndView helloSpring() {

        String message = "Bienvenido lo lograste!";
        return new ModelAndView("index", "message", message);

    }

    @RequestMapping("/pages")
    public ModelAndView pages() {
        String message = "Hola estas en las páginas";
        return new ModelAndView("pages", "message", message);
    }

    @RequestMapping("/blog")
    public @ResponseBody
    ResponseTest getData() throws IOException {

        RestClient client = new RestClient();

        ResponseTest data =  client.getValues();
        LOGGER.info("Here is your response " + data.toString());

        return data;
    }

    @RequestMapping("/view/blog")
    public  ModelAndView viewBlog() throws IOException {

        RestClient client = new RestClient();
        ObjectMapper mapper =  new ObjectMapper();

        ResponseTest data =  client.getValues();

        return new ModelAndView("viewblog", "data", mapper.writeValueAsString(data));

    }

}
