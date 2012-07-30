/*
 * Copyright 2012 Heiko Seeberger
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package name.heikoseeberger.scalalogging

import org.slf4j.LoggerFactory

/**
 * Adds the lazy val logger of type [[$Logger]] to the class into which this trait is mixed.
 *
 * If you need a not-lazy [[$Logger]], which would probably be a special case, use [[name.heikoseeberger.scalalogging.StrictLogging]].
 *
 * @define Logger name.heikoseeberger.scalalogging.Logger
 */
trait Logging {

  protected lazy val logger: Logger =
    Logger(LoggerFactory getLogger getClass.getName)
}

/**
 * Adds the not-lazy val logger of type [[$Logger]] to the class into which this trait is mixed.
 *
 * If you need a lazy [[$Logger]], which would probably be preferrable, use [[name.heikoseeberger.scalalogging.Logging]].
 *
 * @define Logger name.heikoseeberger.scalalogging.Logger
 */
trait StrictLogging {

  protected val logger: Logger =
    Logger(LoggerFactory getLogger getClass.getName)
}