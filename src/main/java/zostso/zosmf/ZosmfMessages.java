/*
 * This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-v20.html
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Copyright Contributors to the Zowe Project.
 */
package zostso.zosmf;

import java.util.Optional;

/**
 * The z/OSMF Ping API error message parameters. See the z/OSMF REST API documentation for full details.
 *
 * @author Frank Giordano
 * @version 1.0
 */
public class ZosmfMessages {

    /**
     * Error message text.
     */
    private Optional<String> messageText;

    /**
     * Error message text ID.
     */
    private Optional<String> messageId;

    /**
     * Error message stack trace.
     */
    private Optional<String> stackTrace;

    /**
     * ZosmfMessages constructor
     *
     * @param messageText error message text value
     * @param messageId   error message text id value
     * @param stackTrace  error message stack trace value
     * @author Frank Giordano
     */
    public ZosmfMessages(String messageText, String messageId, String stackTrace) {
        this.messageText = Optional.ofNullable(messageText);
        this.messageId = Optional.ofNullable(messageId);
        this.stackTrace = Optional.ofNullable(stackTrace);
    }

    /**
     * Retrieve messageText specified
     *
     * @return messageText value
     * @author Frank Giordano
     */
    public Optional<String> getMessageText() {
        return messageText;
    }

    /**
     * Assign messageText value
     *
     * @param messageText value
     * @author Frank Giordano
     */
    public void setMessageText(String messageText) {
        this.messageText = Optional.ofNullable(messageText);
    }

    /**
     * Retrieve messageId specified
     *
     * @return messageId value
     * @author Frank Giordano
     */
    public Optional<String> getMessageId() {
        return messageId;
    }

    /**
     * Assign messageId value
     *
     * @param messageId value
     * @author Frank Giordano
     */
    public void setMessageId(String messageId) {
        this.messageId = Optional.ofNullable(messageId);
    }

    /**
     * Retrieve stackTrace specified
     *
     * @return stackTrace value
     * @author Frank Giordano
     */
    public Optional<String> getStackTrace() {
        return stackTrace;
    }

    /**
     * Assign stackTrace value
     *
     * @param stackTrace value
     * @author Frank Giordano
     */
    public void setStackTrace(String stackTrace) {
        this.stackTrace = Optional.ofNullable(stackTrace);
    }

    @Override
    public String toString() {
        return "ZosmfMessages{" +
                "messageText=" + messageText +
                ", messageId=" + messageId +
                ", stackTrace=" + stackTrace +
                '}';
    }

}
