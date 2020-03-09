package calendar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import calendar.model.Calendar;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class DateController {

    @RequestMapping(value = "/calendar/date", method = RequestMethod.GET)
    public ModelAndView date() {
        ModelAndView model = new ModelAndView();
        model.addObject("data_date", getCalendar());
        model.setViewName("date");
        return model;
    }

    private Calendar getCalendar() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        return new Calendar(dtf.format(LocalDateTime.now()));
    }
}
