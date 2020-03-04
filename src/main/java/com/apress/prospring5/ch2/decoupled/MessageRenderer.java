package com.apress.prospring5.ch2.decoupled;

/**
 *
 * @author
 */
public interface MessageRenderer {

    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
