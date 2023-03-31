package com.kholin.socksstockaut.exception;

import com.kholin.socksstockaut.constant.AppConstants;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class NoSuchColorException extends RuntimeException {
    public NoSuchColorException() {
        super(AppConstants.NO_SUCH_COLOR);
    }
}
