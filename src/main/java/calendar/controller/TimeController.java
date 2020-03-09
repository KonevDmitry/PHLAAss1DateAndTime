package calendar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import calendar.model.Calendar;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.annotation.WebServlet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class TimeController {

    @RequestMapping(value = "/calendar/time", method = RequestMethod.GET)
    public ModelAndView time() {
        ModelAndView model = new ModelAndView();
        model.addObject("data_time", getCalendar());
        model.setViewName("time");
        return model;
    }

    private Calendar getCalendar() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        return new Calendar(dtf.format(LocalDateTime.now()));
    }
}
