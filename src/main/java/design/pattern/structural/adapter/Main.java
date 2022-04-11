package design.pattern.structural.adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Adapter adapter = new AdapterImpl();
        log.info("twiceOf = {}", adapter.twiceOf(10f));
        log.info("halfOf = {}", adapter.halfOf(10f));
    }
}
