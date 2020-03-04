package com.apress.prospring5.ch2.decoupled;

/**
 *
 * @author
 */
public class StandardOutMessageRenderer implements MessageRenderer {

    private MessageProvider provider;

    public void render() {
        if (provider == null) {
            throw new RuntimeException(
                "出现异常" +
                StandardOutMessageRenderer.class.getName()
            );
        }
        System.out.println(provider.getMessage());
    }

    public void setMessageProvider(MessageProvider provider) {
        this.provider = provider;
    }

    public MessageProvider getMessageProvider() {
        return this.provider;
    }
}
