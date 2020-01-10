package configuration;

import com.google.inject.Provider;

public class StringFactory implements Provider<String> {

    public String get() {
        return "Rentala";
    }
}
