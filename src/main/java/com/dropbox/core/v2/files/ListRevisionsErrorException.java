/* DO NOT EDIT */
/* This file was generated from files.babel */

package com.dropbox.core.v2.files;

import com.dropbox.core.DbxApiException;
import com.dropbox.core.LocalizedText;

/**
 * Exception thrown when the server responds with a {@link ListRevisionsError}
 * error.
 */
public class ListRevisionsErrorException extends DbxApiException {
    private static final long serialVersionUID = 0L;

    /**
     * The error reported by {@link DbxUserFilesRequests#listRevisions(String)}.
     */
    public final ListRevisionsError errorValue;

    public ListRevisionsErrorException(String requestId, LocalizedText userMessage, ListRevisionsError errorValue) {
        super(requestId, userMessage, buildMessage("list_revisions", userMessage, errorValue));
        if (errorValue == null) {
            throw new NullPointerException("errorValue");
        }
        this.errorValue = errorValue;
    }
}
