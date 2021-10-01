package io.npee.springmvc.basic.messageconverter;

import io.npee.springmvc.basic.HelloData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class MessageConverterController {

    @ResponseBody
    @GetMapping("/message-converter-byte-to-byte")
    public byte[] byteToByte(@RequestBody byte[] data) {
        log.info("data {}", data);
        return data;
    }

    @ResponseBody
    @GetMapping("/message-converter-byte-to-text")
    public String byteToText(@RequestBody byte[] data) {
        String byteString = new String(data);
        log.info("byteString {}", byteString);
        return byteString;
    }

    @ResponseBody
    @GetMapping("/message-converter-text-to-text")
    public String textToText(@RequestBody String data) {
        log.info("data {}", data);
        return data;
    }

    @ResponseBody
    @GetMapping(value = "/message-converter-text-to-text-2", produces = "application/json")
    public String textToText2(@RequestBody String data) {
        log.info("data {}", data);
        return data;
    }

    @ResponseBody
    @GetMapping("/message-converter-entity-to-entity")
    public HelloData entityToEntity(@RequestBody HelloData data) {
        log.info("data {}", data);
        return data;
    }

    @ResponseBody
    @GetMapping(value = "/message-converter-entity-to-entity-2", produces = "text/html")
    public HelloData entityToEntity2(@RequestBody HelloData data) {
        log.info("data {}", data);
        return data;
    }

    @ResponseBody
    @GetMapping(value = "/message-converter-entity-to-entity-3", produces = "application/json")
    public HelloData entityToEntity3(@RequestBody HelloData data) {
        log.info("data {}", data);
        return data;
    }
}
