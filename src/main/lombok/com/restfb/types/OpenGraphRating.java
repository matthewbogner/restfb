/*
 * Copyright (c) 2010-2024 Mark Allen, Norbert Bartels.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.restfb.types;

import java.util.Date;

import com.restfb.Facebook;

import com.restfb.types.features.HasCreatedTime;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents the <a href="https://developers.facebook.com/docs/graph-api/reference/v2.5/open-graph-rating/"> Open Graph
 * Rating API type</a>.
 *
 * @author Alexander Nenkov
 * @since 1.20.0
 */
public class OpenGraphRating extends FacebookType implements HasCreatedTime {

  /**
   * When the reviewer rated this object.
   *
   * @return When the reviewer rated this object.
   */
  @Getter(onMethod_ = { @Override })
  @Setter
  @Facebook("created_time")
  private Date createdTime;

  /**
   * Was a rating included
   *
   * @return Was a rating included
   */
  @Getter
  @Setter
  @Facebook("has_rating")
  private Boolean hasRating;

  /**
   * Was there text in the rating
   *
   * @return Was there text in the rating
   */
  @Getter
  @Setter
  @Facebook("has_review")
  private Boolean hasReview;

  /**
   * Rating
   *
   * @return Rating
   */
  @Getter
  @Setter
  @Facebook("rating")
  private Integer rating;

  /**
   * Review text included in the review
   *
   * @return Review text included in the review
   */
  @Getter
  @Setter
  @Facebook("review_text")
  private String reviewText;

  /**
   * Person who rated the object
   *
   * @return Person who rated the object
   */
  @Getter
  @Setter
  @Facebook("reviewer")
  private User reviewer;

  /**
   * Recommendation field for change on August 17, 2018
   * <p>
   * for more information check here:
   * <a href="https://www.facebook.com/business/recommendations">https://www.facebook.com/business/recommendations</a>
   *
   * @return the recommendation type
   */
  @Getter
  @Setter
  @Facebook("recommendation_type")
  private RecommendationType recommendationType;

  /**
   * Open Graph story generated by the rating action
   *
   * @return Open Graph story generated by the rating action
   */
  @Getter
  @Setter
  @Facebook("open_graph_story")
  private PageRating openGraphStory;

  /**
   * If OpenGraphRating is a new recommendation
   * 
   * @return <code>true</code> if it is a recommendation, <code>false</code> if it's a rating
   */
  public boolean isRecommendation() {
    return rating == null;
  }

}
