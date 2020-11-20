package hu.uni.eku.tzs.service.exceptions;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

public class FoglalasAlreadyExistsExeptions {
    public FoglalasAlreadyExistsExeptions() {
    }

    public FoglalasAlreadyExistsExeptions(String message) {
        super(message);
    }

    public FoglalasAlreadyExistsExeptions(String message, Throwable cause) {
        super(message, cause);
    }

    public FoglalasAlreadyExistsExeptions(Throwable cause) {
        super(cause);
    }

    public FoglalasAlreadyExistsExeptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
