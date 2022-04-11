package design.pattern.structural.adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AdapterImpl implements Adapter {
    @Override
    public Float twiceOf(Float f) {
//        return (float) Math.multiply(f.doubleValue());
        return Math.multiply2(f.doubleValue()).floatValue(); // adapter만 수정함으로써 알고리즘 변경 가능(client도 미변경)
    }

    @Override
    public Float halfOf(Float f) {
        log.info("call halfOf() method");   // adapter만 수정함으로써 로그 출력 가능(client도 미변경)
        return (float) Math.half(f);
    }
}
