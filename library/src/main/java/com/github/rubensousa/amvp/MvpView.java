/*
 * Copyright 2016 Rúben Sousa
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.rubensousa.amvp;


public interface MvpView<P extends MvpPresenter> {

    /**
     * Get key used to cache the presenter
     * @return A string key that identifies the Presenter
     */
    String getPresenterKey();

    /**
     * @return The Presenter associated to this View
     */
    P getPresenter();

    /**
     * Create the Presenter for this View.
     * <p>
     * This is called on onCreate in Activities/Fragments if a Presenter wasn't found in the cache
     * @return Presenter created
     */
    P createPresenter();
}
