/*
Copyright 2020 Twitter, Inc.
SPDX-License-Identifier: Apache-2.0

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
https://openapi-generator.tech
Do not edit the class manually.
*/


package com.twitter.clientlib.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.twitter.clientlib.model.RulesRequestSummaryOneOf;
import com.twitter.clientlib.model.RulesRequestSummaryOneOf1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import com.twitter.clientlib.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RulesRequestSummary extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(RulesRequestSummary.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!RulesRequestSummary.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'RulesRequestSummary' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<RulesRequestSummaryOneOf> adapterRulesRequestSummaryOneOf = gson.getDelegateAdapter(this, TypeToken.get(RulesRequestSummaryOneOf.class));
            final TypeAdapter<RulesRequestSummaryOneOf1> adapterRulesRequestSummaryOneOf1 = gson.getDelegateAdapter(this, TypeToken.get(RulesRequestSummaryOneOf1.class));

            return (TypeAdapter<T>) new TypeAdapter<RulesRequestSummary>() {
                @Override
                public void write(JsonWriter out, RulesRequestSummary value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `RulesRequestSummaryOneOf`
                    if (value.getActualInstance() instanceof RulesRequestSummaryOneOf) {
                        JsonObject obj = adapterRulesRequestSummaryOneOf.toJsonTree((RulesRequestSummaryOneOf)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `RulesRequestSummaryOneOf1`
                    if (value.getActualInstance() instanceof RulesRequestSummaryOneOf1) {
                        JsonObject obj = adapterRulesRequestSummaryOneOf1.toJsonTree((RulesRequestSummaryOneOf1)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: RulesRequestSummaryOneOf, RulesRequestSummaryOneOf1");
                }

                @Override
                public RulesRequestSummary read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize RulesRequestSummaryOneOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        RulesRequestSummaryOneOf.validateJsonObject(jsonObject);
                        actualAdapter = adapterRulesRequestSummaryOneOf;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'RulesRequestSummaryOneOf'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for RulesRequestSummaryOneOf failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'RulesRequestSummaryOneOf'", e);
                    }

                    // deserialize RulesRequestSummaryOneOf1
                    try {
                        // validate the JSON object to see if any exception is thrown
                        RulesRequestSummaryOneOf1.validateJsonObject(jsonObject);
                        actualAdapter = adapterRulesRequestSummaryOneOf1;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'RulesRequestSummaryOneOf1'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for RulesRequestSummaryOneOf1 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'RulesRequestSummaryOneOf1'", e);
                    }

                    if (match == 1) {
                        RulesRequestSummary ret = new RulesRequestSummary();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for RulesRequestSummary: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public RulesRequestSummary() {
        super("oneOf", Boolean.FALSE);
    }

    public RulesRequestSummary(RulesRequestSummaryOneOf o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public RulesRequestSummary(RulesRequestSummaryOneOf1 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("RulesRequestSummaryOneOf", new GenericType<RulesRequestSummaryOneOf>() {
        });
        schemas.put("RulesRequestSummaryOneOf1", new GenericType<RulesRequestSummaryOneOf1>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return RulesRequestSummary.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * RulesRequestSummaryOneOf, RulesRequestSummaryOneOf1
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof RulesRequestSummaryOneOf) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof RulesRequestSummaryOneOf1) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be RulesRequestSummaryOneOf, RulesRequestSummaryOneOf1");
    }

    /**
     * Get the actual instance, which can be the following:
     * RulesRequestSummaryOneOf, RulesRequestSummaryOneOf1
     *
     * @return The actual instance (RulesRequestSummaryOneOf, RulesRequestSummaryOneOf1)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `RulesRequestSummaryOneOf`. If the actual instance is not `RulesRequestSummaryOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RulesRequestSummaryOneOf`
     * @throws ClassCastException if the instance is not `RulesRequestSummaryOneOf`
     */
    public RulesRequestSummaryOneOf getRulesRequestSummaryOneOf() throws ClassCastException {
        return (RulesRequestSummaryOneOf)super.getActualInstance();
    }

    /**
     * Get the actual instance of `RulesRequestSummaryOneOf1`. If the actual instance is not `RulesRequestSummaryOneOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RulesRequestSummaryOneOf1`
     * @throws ClassCastException if the instance is not `RulesRequestSummaryOneOf1`
     */
    public RulesRequestSummaryOneOf1 getRulesRequestSummaryOneOf1() throws ClassCastException {
        return (RulesRequestSummaryOneOf1)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RulesRequestSummary
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with RulesRequestSummaryOneOf
    try {
      RulesRequestSummaryOneOf.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for RulesRequestSummaryOneOf failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with RulesRequestSummaryOneOf1
    try {
      RulesRequestSummaryOneOf1.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for RulesRequestSummaryOneOf1 failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for RulesRequestSummary with oneOf schemas: RulesRequestSummaryOneOf, RulesRequestSummaryOneOf1. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of RulesRequestSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RulesRequestSummary
  * @throws IOException if the JSON string is invalid with respect to RulesRequestSummary
  */
  public static RulesRequestSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RulesRequestSummary.class);
  }

 /**
  * Convert an instance of RulesRequestSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

