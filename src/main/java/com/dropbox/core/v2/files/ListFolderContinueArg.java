/* DO NOT EDIT */
/* This file was generated from files.babel */

package com.dropbox.core.v2.files;

import com.dropbox.core.json.JsonReadException;
import com.dropbox.core.json.JsonReader;
import com.dropbox.core.json.JsonUtil;
import com.dropbox.core.json.StructJsonDeserializer;
import com.dropbox.core.json.StructJsonSerializer;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.IOException;

@JsonSerialize(using=ListFolderContinueArg.Serializer.class)
@JsonDeserialize(using=ListFolderContinueArg.Deserializer.class)
class ListFolderContinueArg {
    // struct ListFolderContinueArg

    // ProGuard work-around since we declare serializers in annotation
    static final Serializer SERIALIZER = new Serializer();
    static final Deserializer DESERIALIZER = new Deserializer();

    protected final String cursor;

    /**
     *
     * @param cursor  The cursor returned by your last call to {@link
     *     DbxUserFilesRequests#listFolder(String)} or {@link
     *     DbxUserFilesRequests#listFolderContinue(String)}. Must have length of
     *     at least 1 and not be {@code null}.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public ListFolderContinueArg(String cursor) {
        if (cursor == null) {
            throw new IllegalArgumentException("Required value for 'cursor' is null");
        }
        if (cursor.length() < 1) {
            throw new IllegalArgumentException("String 'cursor' is shorter than 1");
        }
        this.cursor = cursor;
    }

    /**
     * The cursor returned by your last call to {@link
     * DbxUserFilesRequests#listFolder(String)} or {@link
     * DbxUserFilesRequests#listFolderContinue(String)}.
     *
     * @return value for this field, never {@code null}.
     */
    public String getCursor() {
        return cursor;
    }

    @Override
    public int hashCode() {
        int hash = java.util.Arrays.hashCode(new Object [] {
            cursor
        });
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        // be careful with inheritance
        else if (obj.getClass().equals(this.getClass())) {
            ListFolderContinueArg other = (ListFolderContinueArg) obj;
            return (this.cursor == other.cursor) || (this.cursor.equals(other.cursor));
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return serialize(false);
    }

    /**
     * Returns a String representation of this object formatted for easier
     * readability.
     *
     * <p> The returned String may contain newlines. </p>
     *
     * @return Formatted, multiline String representation of this object
     */
    public String toStringMultiline() {
        return serialize(true);
    }

    private String serialize(boolean longForm) {
        try {
            return JsonUtil.getMapper(longForm).writeValueAsString(this);
        }
        catch (JsonProcessingException ex) {
            throw new RuntimeException("Failed to serialize object", ex);
        }
    }

    static final class Serializer extends StructJsonSerializer<ListFolderContinueArg> {
        private static final long serialVersionUID = 0L;

        public Serializer() {
            super(ListFolderContinueArg.class);
        }

        public Serializer(boolean unwrapping) {
            super(ListFolderContinueArg.class, unwrapping);
        }

        @Override
        protected JsonSerializer<ListFolderContinueArg> asUnwrapping() {
            return new Serializer(true);
        }

        @Override
        protected void serializeFields(ListFolderContinueArg value, JsonGenerator g, SerializerProvider provider) throws IOException, JsonProcessingException {
            g.writeObjectField("cursor", value.cursor);
        }
    }

    static final class Deserializer extends StructJsonDeserializer<ListFolderContinueArg> {
        private static final long serialVersionUID = 0L;

        public Deserializer() {
            super(ListFolderContinueArg.class);
        }

        public Deserializer(boolean unwrapping) {
            super(ListFolderContinueArg.class, unwrapping);
        }

        @Override
        protected JsonDeserializer<ListFolderContinueArg> asUnwrapping() {
            return new Deserializer(true);
        }

        @Override
        public ListFolderContinueArg deserializeFields(JsonParser _p, DeserializationContext _ctx) throws IOException, JsonParseException {

            String cursor = null;

            while (_p.getCurrentToken() == JsonToken.FIELD_NAME) {
                String _field = _p.getCurrentName();
                _p.nextToken();
                if ("cursor".equals(_field)) {
                    cursor = getStringValue(_p);
                    _p.nextToken();
                }
                else {
                    skipValue(_p);
                }
            }

            if (cursor == null) {
                throw new JsonParseException(_p, "Required field \"cursor\" is missing.");
            }

            return new ListFolderContinueArg(cursor);
        }
    }
}
