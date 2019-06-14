package io.agileintelligence.newprojectexample.web;

import io.agileintelligence.newprojectexample.models.SampleResponse;
import org.springframework.web.bind.annotation.*;
import io.agileintelligence.newprojectexample.models.PostRequest;
import io.agileintelligence.newprojectexample.models.PostResponse;


@RestController
public class WebController {

    @RequestMapping("/sample")
    public SampleResponse Sample(@RequestParam(value = "name", defaultValue = "Robot") String name)
    {
        SampleResponse res = new SampleResponse();
        res.setId(1);
        res.setMessage("Your name is " + name);
        return res;
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public PostResponse Test(@RequestBody PostRequest inputPayLoad)
    {
        PostResponse res = new PostResponse();
        res.setId(inputPayLoad.getId()*100);
        res.setMessage("Hello " + inputPayLoad.getName());
        res.setExtra("Some text");
        return res;
    }
}
