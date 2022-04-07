package com.nowcoder.community;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CommunityApplication {

    @PostConstruct // 管理bean的声明周期的 主要是管理bean的初始化
    public void init() {
        // 解决netty启动冲突问题
        // see Netty4Utils.setAvailableProcessors()

        System.setProperty("es.set.netty.runtime.available.processors", "false");
    }

    public static void main(String[] args) {
        SpringApplication.run(CommunityApplication.class, args);
    }

}
/*
synchronized void setAvailableProcessors(final int availableProcessors) {
	ObjectUtil.checkPositive(availableProcessors, "availableProcessors");
	**if (this.availableProcessors != 0) {
		final String message = String.format(
				Locale.ROOT,
				"availableProcessors is already set to [%d], rejecting [%d]",
				this.availableProcessors,
				availableProcessors);
		throw new IllegalStateException(message);
	}
	this.availableProcessors = availableProcessors;
}

public static void setAvailableProcessors(final int availableProcessors) {
	// we set this to false in tests to avoid tests that randomly set processors from stepping on each other
	**final boolean set = Booleans.parseBoolean(System.getProperty("es.set.netty.runtime.available.processors", "true"));
	if (!set) {
		return;
	}

	if (isAvailableProcessorsSet.compareAndSet(false, true)) {
		NettyRuntime.setAvailableProcessors(availableProcessors); **
	} else if (availableProcessors != NettyRuntime.availableProcessors()) {

		final String message = String.format(
                Locale.ROOT,
                "available processors value [%d] did not match current value [%d]",
                availableProcessors,
                NettyRuntime.availableProcessors());
		throw new IllegalStateException(message);
    }
}

*/
