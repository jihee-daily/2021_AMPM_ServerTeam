package kr.ac.jbnu.ampm.x_jihee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class Controller {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<?> responseEntity(HttpServletRequest request){
        ResponseEntity<?> responseEntity = null;

        responseEntity = new ResponseEntity<>("OK", HttpStatus.OK);

        Logger log = LoggerFactory.getLogger(this.getClass());
        log.info("$$$ school exam soon OMGGGGGG $$$" );

        return responseEntity;
    }
}
