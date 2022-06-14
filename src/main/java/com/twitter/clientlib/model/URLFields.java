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
import com.twitter.clientlib.model.UrlImage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.twitter.clientlib.JSON;

/**
 * Represent the portion of text recognized as a URL.
 */
@ApiModel(description = "Represent the portion of text recognized as a URL.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UrlFields {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DISPLAY_URL = "display_url";
  @SerializedName(SERIALIZED_NAME_DISPLAY_URL)
  private String displayUrl;

  public static final String SERIALIZED_NAME_EXPANDED_URL = "expanded_url";
  @SerializedName(SERIALIZED_NAME_EXPANDED_URL)
  private URL expandedUrl;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private List<UrlImage> images = null;

  public static final String SERIALIZED_NAME_MEDIA_KEY = "media_key";
  @SerializedName(SERIALIZED_NAME_MEDIA_KEY)
  private String mediaKey;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_UNWOUND_URL = "unwound_url";
  @SerializedName(SERIALIZED_NAME_UNWOUND_URL)
  private URL unwoundUrl;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URL url;

  public UrlFields() { 
  }

  public UrlFields description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the URL landing page.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "This is a description of the website.", value = "Description of the URL landing page.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public UrlFields displayUrl(String displayUrl) {
    
    this.displayUrl = displayUrl;
    return this;
  }

   /**
   * The URL as displayed in the Twitter client.
   * @return displayUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "twittercommunity.com/t/introducing-…", value = "The URL as displayed in the Twitter client.")

  public String getDisplayUrl() {
    return displayUrl;
  }


  public void setDisplayUrl(String displayUrl) {
    this.displayUrl = displayUrl;
  }


  public UrlFields expandedUrl(URL expandedUrl) {
    
    this.expandedUrl = expandedUrl;
    return this;
  }

   /**
   * A validly formatted URL.
   * @return expandedUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://developer.twitter.com/en/docs/twitter-api", value = "A validly formatted URL.")

  public URL getExpandedUrl() {
    return expandedUrl;
  }


  public void setExpandedUrl(URL expandedUrl) {
    this.expandedUrl = expandedUrl;
  }


  public UrlFields images(List<UrlImage> images) {
    
    this.images = images;
    return this;
  }

  public UrlFields addImagesItem(UrlImage imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * Get images
   * @return images
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UrlImage> getImages() {
    return images;
  }


  public void setImages(List<UrlImage> images) {
    this.images = images;
  }


  public UrlFields mediaKey(String mediaKey) {
    
    this.mediaKey = mediaKey;
    return this;
  }

   /**
   * The Media Key identifier for this attachment.
   * @return mediaKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Media Key identifier for this attachment.")

  public String getMediaKey() {
    return mediaKey;
  }


  public void setMediaKey(String mediaKey) {
    this.mediaKey = mediaKey;
  }


  public UrlFields status(Integer status) {
    
    this.status = status;
    return this;
  }

   /**
   * HTTP Status Code.
   * minimum: 100
   * maximum: 599
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HTTP Status Code.")

  public Integer getStatus() {
    return status;
  }


  public void setStatus(Integer status) {
    this.status = status;
  }


  public UrlFields title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Title of the page the URL points to.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Introducing the v2 follow lookup endpoints", value = "Title of the page the URL points to.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public UrlFields unwoundUrl(URL unwoundUrl) {
    
    this.unwoundUrl = unwoundUrl;
    return this;
  }

   /**
   * Fully resolved url.
   * @return unwoundUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://twittercommunity.com/t/introducing-the-v2-follow-lookup-endpoints/147118", value = "Fully resolved url.")

  public URL getUnwoundUrl() {
    return unwoundUrl;
  }


  public void setUnwoundUrl(URL unwoundUrl) {
    this.unwoundUrl = unwoundUrl;
  }


  public UrlFields url(URL url) {
    
    this.url = url;
    return this;
  }

   /**
   * A validly formatted URL.
   * @return url
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://developer.twitter.com/en/docs/twitter-api", required = true, value = "A validly formatted URL.")

  public URL getUrl() {
    return url;
  }


  public void setUrl(URL url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlFields urlFields = (UrlFields) o;
    return Objects.equals(this.description, urlFields.description) &&
        Objects.equals(this.displayUrl, urlFields.displayUrl) &&
        Objects.equals(this.expandedUrl, urlFields.expandedUrl) &&
        Objects.equals(this.images, urlFields.images) &&
        Objects.equals(this.mediaKey, urlFields.mediaKey) &&
        Objects.equals(this.status, urlFields.status) &&
        Objects.equals(this.title, urlFields.title) &&
        Objects.equals(this.unwoundUrl, urlFields.unwoundUrl) &&
        Objects.equals(this.url, urlFields.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, displayUrl, expandedUrl, images, mediaKey, status, title, unwoundUrl, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlFields {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayUrl: ").append(toIndentedString(displayUrl)).append("\n");
    sb.append("    expandedUrl: ").append(toIndentedString(expandedUrl)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    mediaKey: ").append(toIndentedString(mediaKey)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    unwoundUrl: ").append(toIndentedString(unwoundUrl)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("description");
    openapiFields.add("display_url");
    openapiFields.add("expanded_url");
    openapiFields.add("images");
    openapiFields.add("media_key");
    openapiFields.add("status");
    openapiFields.add("title");
    openapiFields.add("unwound_url");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("url");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UrlFields
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
     // if (jsonObj == null) {
     //   if (UrlFields.openapiRequiredFields.isEmpty()) {
     //     return;
     //   } else { // has required fields
     //     throw new IllegalArgumentException(String.format("The required field(s) %s in UrlFields is not found in the empty JSON string", UrlFields.openapiRequiredFields.toString()));
     //   }
     // }


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UrlFields.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("display_url") != null && !jsonObj.get("display_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display_url").toString()));
      }
      if (jsonObj.get("expanded_url") != null && !jsonObj.get("expanded_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expanded_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expanded_url").toString()));
      }
      JsonArray jsonArrayimages = jsonObj.getAsJsonArray("images");
      if (jsonArrayimages != null) {
        // ensure the json data is an array
        if (!jsonObj.get("images").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `images` to be an array in the JSON string but got `%s`", jsonObj.get("images").toString()));
        }

        // validate the optional field `images` (array)
        for (int i = 0; i < jsonArrayimages.size(); i++) {
          UrlImage.validateJsonObject(jsonArrayimages.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("media_key") != null && !jsonObj.get("media_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `media_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("media_key").toString()));
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (jsonObj.get("unwound_url") != null && !jsonObj.get("unwound_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unwound_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unwound_url").toString()));
      }
      if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UrlFields.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UrlFields' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UrlFields> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UrlFields.class));

       return (TypeAdapter<T>) new TypeAdapter<UrlFields>() {
           @Override
           public void write(JsonWriter out, UrlFields value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UrlFields read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UrlFields given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UrlFields
  * @throws IOException if the JSON string is invalid with respect to UrlFields
  */
  public static UrlFields fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UrlFields.class);
  }

 /**
  * Convert an instance of UrlFields to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

